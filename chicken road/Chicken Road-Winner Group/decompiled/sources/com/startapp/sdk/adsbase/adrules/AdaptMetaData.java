package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AdaptMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final transient AdaptMetaData f3180a = new AdaptMetaData();

    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "5.3.0";

    private AdaptMetaData() {
    }

    public static AdaptMetaData b() {
        return f3180a;
    }

    public final AdRules a() {
        return this.adRules;
    }
}
