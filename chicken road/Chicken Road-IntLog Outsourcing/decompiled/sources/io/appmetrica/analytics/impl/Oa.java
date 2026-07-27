package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public interface Oa {
    Oa a(int i2, String str);

    Oa a(String str, float f3);

    Oa a(String str, long j2);

    Oa a(String str, String str2);

    Oa a(String str, boolean z);

    Set a();

    boolean a(String str);

    void b();

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i2);

    long getLong(String str, long j2);

    String getString(String str, String str2);

    Oa remove(String str);
}
