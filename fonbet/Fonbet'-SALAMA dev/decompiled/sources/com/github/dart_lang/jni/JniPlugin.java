package com.github.dart_lang.jni;

import Q3.o;
import android.app.Activity;
import android.content.Context;
import q5.AbstractActivityC1559c;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes.dex */
public class JniPlugin implements InterfaceC1783c, InterfaceC1789a {
    static {
        System.loadLibrary("dartjni");
    }

    private void setup(Context context) {
        initializeJni(context, getClass().getClassLoader());
    }

    public native void initializeJni(Context context, ClassLoader classLoader);

    @Override // x5.InterfaceC1789a
    public void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
        setJniActivity(abstractActivityC1559c, abstractActivityC1559c.getApplicationContext());
    }

    @Override // w5.InterfaceC1783c
    public void onAttachedToEngine(C1782b c1782b) {
        setup(c1782b.f18075a);
    }

    @Override // x5.InterfaceC1789a
    public void onDetachedFromActivity() {
    }

    @Override // x5.InterfaceC1789a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // x5.InterfaceC1789a
    public void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
        setJniActivity(abstractActivityC1559c, abstractActivityC1559c.getApplicationContext());
    }

    public native void setJniActivity(Activity activity, Context context);

    @Override // w5.InterfaceC1783c
    public void onDetachedFromEngine(C1782b c1782b) {
    }
}
