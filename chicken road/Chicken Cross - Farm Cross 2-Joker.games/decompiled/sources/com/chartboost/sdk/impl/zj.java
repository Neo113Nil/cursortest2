package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public abstract class zj {
    public static final jf b(wj wjVar, nh nhVar, k8 k8Var) {
        File a2;
        RandomAccessFile randomAccessFile;
        if (k8Var != null) {
            try {
                a2 = k8Var.a(k8Var.b(), wjVar.d());
            } catch (Exception e) {
                mb.b(e.toString(), (Throwable) null, 2, (Object) null);
            }
        } else {
            a2 = null;
        }
        if (a2 == null || !a2.exists()) {
            File a3 = nhVar.a(wjVar.b(), wjVar.d());
            if (a3 != null) {
                randomAccessFile = nhVar.a(a3);
            }
            randomAccessFile = null;
        } else {
            randomAccessFile = nhVar.a(a2);
        }
        if (randomAccessFile != null) {
            return new jf(randomAccessFile);
        }
        return null;
    }
}
