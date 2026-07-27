package com.yandex.varioqub.config;

import a.AbstractC0169a;
import android.content.Context;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.impl.A;
import com.yandex.varioqub.config.impl.B;
import com.yandex.varioqub.config.model.ConfigValue;
import f4.InterfaceC0428e;
import java.util.Map;
import java.util.Set;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class Varioqub {
    public static final Varioqub INSTANCE = new Varioqub();

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC0428e f5370a = AbstractC0169a.A(A.f5384a);

    private Varioqub() {
    }

    public static final void activateConfig(InterfaceC1430a interfaceC1430a) {
        getInstance().activateConfig(interfaceC1430a);
    }

    public static /* synthetic */ void activateConfig$default(InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC1430a = null;
        }
        activateConfig(interfaceC1430a);
    }

    public static final void clearClientFeatures() {
        getInstance().clearClientFeatures();
    }

    public static final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        getInstance().fetchConfig(onFetchCompleteListener);
    }

    public static final Set<String> getAllKeys() {
        return getInstance().getAllKeys();
    }

    public static final boolean getBoolean(String str, boolean z) {
        return getInstance().getBoolean(str, z);
    }

    public static /* synthetic */ boolean getBoolean$default(String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return getBoolean(str, z);
    }

    public static final double getDouble(String str, double d6) {
        return getInstance().getDouble(str, d6);
    }

    public static /* synthetic */ double getDouble$default(String str, double d6, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d6 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        return getDouble(str, d6);
    }

    public static final String getId() {
        return getInstance().getId();
    }

    public static final VarioqubApi getInstance() {
        INSTANCE.getClass();
        return (B) f5370a.getValue();
    }

    public static final long getLong(String str, long j2) {
        return getInstance().getLong(str, j2);
    }

    public static /* synthetic */ long getLong$default(String str, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return getLong(str, j2);
    }

    public static final String getString(String str, String str2) {
        return getInstance().getString(str, str2);
    }

    public static /* synthetic */ String getString$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        return getString(str, str2);
    }

    public static final ConfigValue getValue(String str) {
        return getInstance().getValue(str);
    }

    public static final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        getInstance().init(varioqubSettings, varioqubConfigAdapter, context);
    }

    public static final void putClientFeature(String str, String str2) {
        getInstance().putClientFeature(str, str2);
    }

    public static final void setDefaults(Map<String, ? extends Object> map) {
        getInstance().setDefaults(map);
    }

    public static /* synthetic */ void setDefaults$default(int i2, InterfaceC1430a interfaceC1430a, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC1430a = null;
        }
        setDefaults(i2, interfaceC1430a);
    }

    public static final void setDefaults(int i2, InterfaceC1430a interfaceC1430a) {
        getInstance().setDefaults(i2, interfaceC1430a);
    }
}
