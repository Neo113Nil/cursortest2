package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class By {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7922a = Logger.getLogger(By.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f7923b = new AtomicBoolean(false);

    public static boolean a() {
        return f7923b.get();
    }
}
