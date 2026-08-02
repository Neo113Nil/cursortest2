package io.sentry.android.ndk;

import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScope;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.ndk.INativeScope;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class NdkScopeObserver extends ScopeObserverAdapter {
    private final INativeScope nativeScope;
    private final SentryOptions options;

    public NdkScopeObserver(SentryOptions sentryOptions) {
        this(sentryOptions, new NativeScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addBreadcrumb$1(Breadcrumb breadcrumb) {
        String str = null;
        String lowerCase = breadcrumb.getLevel() != null ? breadcrumb.getLevel().name().toLowerCase(Locale.ROOT) : null;
        String timestamp = DateUtils.getTimestamp(breadcrumb.getTimestamp());
        try {
            Map<String, Object> data = breadcrumb.getData();
            if (!data.isEmpty()) {
                str = this.options.getSerializer().serialize(data);
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
        }
        this.nativeScope.addBreadcrumb(lowerCase, breadcrumb.getMessage(), breadcrumb.getCategory(), breadcrumb.getType(), timestamp, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeExtra$5(String str) {
        this.nativeScope.removeExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeTag$3(String str) {
        this.nativeScope.removeTag(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExtra$4(String str, String str2) {
        this.nativeScope.setExtra(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTag$2(String str, String str2) {
        this.nativeScope.setTag(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrace$6(SpanContext spanContext) {
        this.nativeScope.setTrace(spanContext.getTraceId().toString(), spanContext.getSpanId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUser$0(User user) {
        if (user == null) {
            this.nativeScope.removeUser();
        } else {
            this.nativeScope.setUser(user.getId(), user.getEmail(), user.getIpAddress(), user.getUsername());
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        try {
            this.options.getExecutorService().submit(new K5.a(22, this, breadcrumb));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void removeExtra(String str) {
        try {
            this.options.getExecutorService().submit(new b(this, str, 1));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void removeTag(String str) {
        try {
            this.options.getExecutorService().submit(new b(this, str, 0));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtra(String str, String str2) {
        try {
            this.options.getExecutorService().submit(new a(this, str, str2, 0));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTag(String str, String str2) {
        try {
            this.options.getExecutorService().submit(new a(this, str, str2, 1));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(SpanContext spanContext, IScope iScope) {
        if (spanContext == null) {
            return;
        }
        try {
            this.options.getExecutorService().submit(new K5.a(21, this, spanContext));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(User user) {
        try {
            this.options.getExecutorService().submit(new K5.a(23, this, user));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    public NdkScopeObserver(SentryOptions sentryOptions, INativeScope iNativeScope) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions object is required.");
        this.nativeScope = (INativeScope) Objects.requireNonNull(iNativeScope, "The NativeScope object is required.");
    }
}
