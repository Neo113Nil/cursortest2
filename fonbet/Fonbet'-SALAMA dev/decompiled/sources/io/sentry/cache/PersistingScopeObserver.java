package io.sentry.cache;

import A1.RunnableC0032m0;
import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.ISerializer;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.cache.tape.ObjectQueue;
import io.sentry.cache.tape.QueueFile;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.LazyEvaluator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PersistingScopeObserver extends ScopeObserverAdapter {
    public static final String BREADCRUMBS_FILENAME = "breadcrumbs.json";
    public static final String CONTEXTS_FILENAME = "contexts.json";
    public static final String EXTRAS_FILENAME = "extras.json";
    public static final String FINGERPRINT_FILENAME = "fingerprint.json";
    public static final String LEVEL_FILENAME = "level.json";
    public static final String REPLAY_FILENAME = "replay.json";
    public static final String REQUEST_FILENAME = "request.json";
    public static final String SCOPE_CACHE = ".scope-cache";
    public static final String TAGS_FILENAME = "tags.json";
    public static final String TRACE_FILENAME = "trace.json";
    public static final String TRANSACTION_FILENAME = "transaction.json";
    public static final String USER_FILENAME = "user.json";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final LazyEvaluator<ObjectQueue<Breadcrumb>> breadcrumbsQueue = new LazyEvaluator<>(new a(this, 1));
    private SentryOptions options;

    public PersistingScopeObserver(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private void delete(String str) {
        CacheUtils.delete(this.options, SCOPE_CACHE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addBreadcrumb$2(Breadcrumb breadcrumb) {
        try {
            this.breadcrumbsQueue.getValue().add(breadcrumb);
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to add breadcrumb to file queue", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObjectQueue lambda$new$0() {
        QueueFile build;
        File ensureCacheDir = CacheUtils.ensureCacheDir(this.options, SCOPE_CACHE);
        if (ensureCacheDir == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return ObjectQueue.createEmpty();
        }
        File file = new File(ensureCacheDir, BREADCRUMBS_FILENAME);
        try {
            try {
                build = new QueueFile.Builder(file).size(this.options.getMaxBreadcrumbs()).build();
            } catch (IOException e7) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to create breadcrumbs queue", e7);
                return ObjectQueue.createEmpty();
            }
        } catch (IOException unused) {
            file.delete();
            build = new QueueFile.Builder(file).size(this.options.getMaxBreadcrumbs()).build();
        }
        return ObjectQueue.create(build, new ObjectQueue.Converter<Breadcrumb>() { // from class: io.sentry.cache.PersistingScopeObserver.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.cache.tape.ObjectQueue.Converter
            public Breadcrumb from(byte[] bArr) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), PersistingScopeObserver.UTF_8));
                    try {
                        Breadcrumb breadcrumb = (Breadcrumb) PersistingScopeObserver.this.options.getSerializer().deserialize(bufferedReader, Breadcrumb.class);
                        bufferedReader.close();
                        return breadcrumb;
                    } finally {
                    }
                } catch (Throwable th) {
                    PersistingScopeObserver.this.options.getLogger().log(SentryLevel.ERROR, th, "Error reading entity from scope cache", new Object[0]);
                    return null;
                }
            }

            @Override // io.sentry.cache.tape.ObjectQueue.Converter
            public void toStream(Breadcrumb breadcrumb, OutputStream outputStream) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, PersistingScopeObserver.UTF_8));
                try {
                    PersistingScopeObserver.this.options.getSerializer().serialize((ISerializer) breadcrumb, (Writer) bufferedWriter);
                    bufferedWriter.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$serializeToDisk$13(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBreadcrumbs$3() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setContexts$11(Contexts contexts) {
        store(contexts, CONTEXTS_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExtras$5(Map map) {
        store(map, EXTRAS_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFingerprint$7(Collection collection) {
        store(collection, FINGERPRINT_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLevel$8(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            delete(LEVEL_FILENAME);
        } else {
            store(sentryLevel, LEVEL_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setReplayId$12(SentryId sentryId) {
        store(sentryId, REPLAY_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRequest$6(Request request) {
        if (request == null) {
            delete(REQUEST_FILENAME);
        } else {
            store(request, REQUEST_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTags$4(Map map) {
        store(map, "tags.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrace$10(SpanContext spanContext, IScope iScope) {
        if (spanContext == null) {
            store(iScope.getPropagationContext().toSpanContext(), TRACE_FILENAME);
        } else {
            store(spanContext, TRACE_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTransaction$9(String str) {
        if (str == null) {
            delete(TRANSACTION_FILENAME);
        } else {
            store(str, TRANSACTION_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUser$1(User user) {
        if (user == null) {
            delete(USER_FILENAME);
        } else {
            store(user, USER_FILENAME);
        }
    }

    private void serializeToDisk(Runnable runnable) {
        if (this.options.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                this.options.getExecutorService().submit(new f(0, this, runnable));
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    private <T> void store(T t7, String str) {
        store(this.options, t7, str);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        serializeToDisk(new f(3, this, breadcrumb));
    }

    public <T> T read(SentryOptions sentryOptions, String str, Class<T> cls) {
        if (!str.equals(BREADCRUMBS_FILENAME)) {
            return (T) CacheUtils.read(sentryOptions, SCOPE_CACHE, str, cls, null);
        }
        try {
            return cls.cast(this.breadcrumbsQueue.getValue().asList());
        } catch (IOException unused) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void resetCache() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e7);
        }
        delete(USER_FILENAME);
        delete(LEVEL_FILENAME);
        delete(REQUEST_FILENAME);
        delete(FINGERPRINT_FILENAME);
        delete(CONTEXTS_FILENAME);
        delete(EXTRAS_FILENAME);
        delete("tags.json");
        delete(TRACE_FILENAME);
        delete(TRANSACTION_FILENAME);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setBreadcrumbs(Collection<Breadcrumb> collection) {
        if (collection.isEmpty()) {
            serializeToDisk(new Runnable() { // from class: io.sentry.cache.e
                @Override // java.lang.Runnable
                public final void run() {
                    PersistingScopeObserver.this.lambda$setBreadcrumbs$3();
                }
            });
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setContexts(Contexts contexts) {
        serializeToDisk(new K5.a(26, this, contexts));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtras(Map<String, Object> map) {
        serializeToDisk(new d(this, map, 0));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setFingerprint(Collection<String> collection) {
        serializeToDisk(new f(2, this, collection));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setLevel(SentryLevel sentryLevel) {
        serializeToDisk(new K5.a(29, this, sentryLevel));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setReplayId(SentryId sentryId) {
        serializeToDisk(new K5.a(25, this, sentryId));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setRequest(Request request) {
        serializeToDisk(new f(1, this, request));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTags(Map<String, String> map) {
        serializeToDisk(new d(this, map, 1));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(SpanContext spanContext, IScope iScope) {
        serializeToDisk(new RunnableC0032m0(this, spanContext, iScope, 23));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTransaction(String str) {
        serializeToDisk(new K5.a(27, this, str));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(User user) {
        serializeToDisk(new K5.a(28, this, user));
    }

    public static <T> void store(SentryOptions sentryOptions, T t7, String str) {
        CacheUtils.store(sentryOptions, t7, SCOPE_CACHE, str);
    }
}
