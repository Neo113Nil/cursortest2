package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.R;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12069a;
    public final Handler b;
    public AtomicReference c;
    public AtomicReference d;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12069a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
    }

    public static final void a(c this$0) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!Omid.isActive()) {
                Omid.activate(this$0.f12069a);
            }
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z = u.f12190a;
            t.b("OMInjector", l.a("error: ").append(m8082exceptionOrNullimpl.getLocalizedMessage()).toString());
        }
    }

    public final void b() {
        this.b.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this);
            }
        });
    }

    public final void a(File dir) {
        FileWriter fileWriter;
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, "omsdk.js");
        if (!file.exists()) {
            boolean z = u.f12190a;
            t.a("OMInjector", l.a("injecting omsdk.js to ").append(file.getAbsolutePath()).toString());
            String a2 = a();
            if (a2 != null) {
                fileWriter = new FileWriter(file);
                try {
                    fileWriter.write(a2);
                    fileWriter.flush();
                    CloseableKt.closeFinally(fileWriter, null);
                } finally {
                }
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, "omsdk-session.js");
        if (file2.exists()) {
            return;
        }
        boolean z2 = u.f12190a;
        t.a("OMInjector", l.a("injecting omsdk-session.js to ").append(file2.getAbsolutePath()).toString());
        String str = (String) this.d.get();
        if (str == null) {
            str = a(R.raw.omid_session_client_v1_6_2);
            this.d.set(str);
        }
        if (str != null) {
            fileWriter = new FileWriter(file2);
            try {
                fileWriter.write(str);
                fileWriter.flush();
                CloseableKt.closeFinally(fileWriter, null);
            } finally {
            }
        }
        arrayList.add(file2);
    }

    public final String a() {
        String str = (String) this.c.get();
        if (str != null) {
            return str;
        }
        String a2 = a(R.raw.omsdk_v1_6_2);
        this.c.set(a2);
        return a2;
    }

    public final String a(int i) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream openRawResource = this.f12069a.getResources().openRawResource(i);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRawResource(resId)");
            Reader inputStreamReader = new InputStreamReader(openRawResource, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                m8079constructorimpl = Result.m8079constructorimpl(readText);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
    }
}
