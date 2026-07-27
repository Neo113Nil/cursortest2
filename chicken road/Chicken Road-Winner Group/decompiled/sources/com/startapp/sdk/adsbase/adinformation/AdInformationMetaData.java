package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AdInformationMetaData f3139a = new AdInformationMetaData();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3140b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;

    @TypeInfo(complex = true)
    private AdInformationConfig AdInformation = new AdInformationConfig();
    private String adInformationMetadataUpdateVersion = "5.3.0";

    public static void b(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) e7.b(context, "StartappAdInfoMetadata");
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean a3 = si.a((Serializable) adInformationMetaData, (Serializable) adInformationMetaData2);
            if ("5.3.0".equals(adInformationMetaData.adInformationMetadataUpdateVersion) && a3) {
                d9 d9Var = new d9(e9.f3618e);
                d9Var.f3574d = "metadata_null";
                d9Var.a();
            }
            adInformationMetaData.AdInformation.initTransientFields();
            f3139a = adInformationMetaData;
        } else {
            f3139a = adInformationMetaData2;
        }
        f3139a.AdInformation.initImageResourceConfigBitmaps(context);
    }

    public static AdInformationMetaData c() {
        return f3139a;
    }

    public final AdInformationConfig a() {
        return this.AdInformation;
    }

    public final String d() {
        return this.AdInformation.getPrivacyIconUrl();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
            if (si.a((Object) this.AdInformation, (Object) adInformationMetaData.AdInformation) && si.a((Object) this.adInformationMetadataUpdateVersion, (Object) adInformationMetaData.adInformationMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f3140b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "5.3.0";
            f3139a = adInformationMetaData;
            f3139a.AdInformation.initImageResourceConfigBitmaps(context);
            e7.c(context, "StartappAdInfoMetadata", adInformationMetaData);
        }
    }

    public final Drawable a(Context context) {
        return this.AdInformation.getPrivacyIcon(context);
    }

    public final String b() {
        return this.AdInformation.getEulaUrl();
    }
}
