package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public interface Oa {
    Oa a(int i3, String str);

    Oa a(String str, float f);

    Oa a(String str, long j3);

    Oa a(String str, String str2);

    Oa a(String str, boolean z3);

    Set a();

    boolean a(String str);

    void b();

    boolean getBoolean(String str, boolean z3);

    int getInt(String str, int i3);

    long getLong(String str, long j3);

    String getString(String str, String str2);

    Oa remove(String str);
}
