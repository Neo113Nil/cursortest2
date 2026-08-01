package com.vungle.ads.internal.session;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.executor.d;
import com.vungle.ads.internal.model.s3;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes7.dex */
public final class b {
    public static final Json f = JsonKt.Json$default(null, a.f12117a, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f12118a;
    public final com.vungle.ads.internal.executor.a b;
    public File c;
    public final CopyOnWriteArrayList d;
    public boolean e;

    public b(Context context, String sessionId, com.vungle.ads.internal.executor.a executors, PathProvider pathProvider) {
        Object m8079constructorimpl;
        boolean m8086isSuccessimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.f12118a = sessionId;
        this.b = executors;
        this.c = pathProvider.b();
        this.d = new CopyOnWriteArrayList();
        if (this.c.exists()) {
            m8086isSuccessimpl = true;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(Boolean.valueOf(this.c.createNewFile()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
            if (m8082exceptionOrNullimpl != null) {
                boolean z = u.f12190a;
                t.b("UnclosedAdDetector", l.a("Fail to create unclosed ad file: ").append(m8082exceptionOrNullimpl.getMessage()).toString());
            }
            m8086isSuccessimpl = Result.m8086isSuccessimpl(m8079constructorimpl);
        }
        this.e = m8086isSuccessimpl;
    }

    public final void a(s3 ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.e) {
            ad.a(this.f12118a);
            this.d.add(ad);
            a(this.d);
        }
    }

    public final void b(s3 ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.e && this.d.contains(ad)) {
            this.d.remove(ad);
            a(this.d);
        }
    }

    public final List a() {
        if (!this.e) {
            return CollectionsKt.emptyList();
        }
        final File file = this.c;
        return (List) new com.vungle.ads.internal.executor.b(((d) this.b).c().submit(new Callable() { // from class: com.vungle.ads.internal.session.b$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.a(file);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (!this.e) {
            return arrayList;
        }
        List a2 = a();
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        final File file = this.c;
        ((d) this.b).f11913a.execute(new Runnable() { // from class: com.vungle.ads.internal.session.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                b.b(file);
            }
        });
        return arrayList;
    }

    public static final void b(File fileToDelete) {
        Intrinsics.checkNotNullParameter(fileToDelete, "$fileToDelete");
        try {
            n.b(fileToDelete);
        } catch (Exception e) {
            boolean z = u.f12190a;
            t.b("UnclosedAdDetector", l.a("Fail to delete file ").append(e.getMessage()).toString());
        }
    }

    public static final List a(File fileToRead) {
        List arrayList;
        Intrinsics.checkNotNullParameter(fileToRead, "$fileToRead");
        try {
            String d = n.d(fileToRead);
            if (d != null && d.length() != 0) {
                Json json = f;
                KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(s3.class))));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                arrayList = (List) json.decodeFromString(serializer, d);
                return arrayList;
            }
            arrayList = new ArrayList();
            return arrayList;
        } catch (Exception e) {
            boolean z = u.f12190a;
            t.b("UnclosedAdDetector", l.a("Fail to read unclosed ad file ").append(e.getMessage()).toString());
            return new ArrayList();
        }
    }

    public final void a(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (this.e) {
            try {
                Json json = f;
                KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(s3.class))));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String encodeToString = json.encodeToString(serializer, copyOnWriteArrayList);
                final File file = this.c;
                ((d) this.b).c().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a(file, encodeToString);
                    }
                });
            } catch (Throwable th) {
                boolean z = u.f12190a;
                t.b("UnclosedAdDetector", l.a("Fail to write unclosed ad file ").append(th.getMessage()).toString());
            }
        }
    }

    public static final void a(File fileToWrite, String jsonContent) {
        Intrinsics.checkNotNullParameter(fileToWrite, "$fileToWrite");
        Intrinsics.checkNotNullParameter(jsonContent, "$jsonContent");
        n.a(fileToWrite, jsonContent);
    }
}
