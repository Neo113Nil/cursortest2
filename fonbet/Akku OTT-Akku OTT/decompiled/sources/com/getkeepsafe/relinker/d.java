package com.getkeepsafe.relinker;

import android.content.Context;
import androidx.media3.common.C0338w;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class d {
    public final HashSet a;
    public final e b;
    public final a c;
    public C0338w d;

    public d() {
        e eVar = new e();
        a aVar = new a();
        this.a = new HashSet();
        this.b = eVar;
        this.c = aVar;
    }

    public final File a(Context context) {
        this.b.getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public final void b(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (this.d != null) {
            Log.d(FlutterJNI.TAG, format);
        }
    }
}
