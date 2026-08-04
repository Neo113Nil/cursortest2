package com.github.dart_lang.jni;

import Q3.o;
import android.app.Activity;
import android.content.Context;
import p159w5.c;
import p164x5.b;

/* JADX INFO: loaded from: classes.dex */
public class JniPlugin implements c, p164x5.a {
    static {
        System.loadLibrary("dartjni");
    }

    private void setup(Context context) {
        initializeJni(context, getClass().getClassLoader());
    }

    public native void initializeJni(Context context, ClassLoader classLoader);

    @Override // p164x5.a
    public void onAttachedToActivity(b bVar) {
        p121q5.c cVar = (p121q5.c) ((o) bVar).f5822a;
        setJniActivity(cVar, cVar.getApplicationContext());
    }

    @Override // p159w5.c
    public void onAttachedToEngine(p159w5.b bVar) {
        setup(bVar.f18081a);
    }

    @Override // p164x5.a
    public void onDetachedFromActivity() {
    }

    @Override // p164x5.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // p164x5.a
    public void onReattachedToActivityForConfigChanges(b bVar) {
        p121q5.c cVar = (p121q5.c) ((o) bVar).f5822a;
        setJniActivity(cVar, cVar.getApplicationContext());
    }

    public native void setJniActivity(Activity activity, Context context);

    @Override // p159w5.c
    public void onDetachedFromEngine(p159w5.b bVar) {
    }
}
