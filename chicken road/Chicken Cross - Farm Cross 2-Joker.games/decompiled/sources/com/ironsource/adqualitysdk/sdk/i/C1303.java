package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1303 extends AbstractC0599 implements InterfaceC0388, InterfaceC0947 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final InterfaceC0388 f3726;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object f3727;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Map f3728;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Collection f3729;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field f3730;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3725 = StringFog.decrypt("ojh92OxKeV2INnP04k5T\n", "7VoXvY8+PzQ=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f3724 = StringFog.decrypt("ca/794KIl80=\n", "FsqPoePk4qg=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f3723 = StringFog.decrypt("rOm1o+9f0EM=\n", "34zB9Y4zpSY=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f3722 = StringFog.decrypt("qgrXoNRZxQ==\n", "w3mRybE1oZA=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f3721 = StringFog.decrypt("p8V3AohwCCY=\n", "wKADROEVZEI=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f3720 = StringFog.decrypt("VSnnjVfGmGhIM8uM\n", "PFqk4juq/Qs=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3719 = StringFog.decrypt("nu592aeu7CSa/2D1pg==\n", "+YsJmsjCgEE=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3718 = StringFog.decrypt("C4FaKoA=\n", "YvIXS/AX0Yk=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f3717 = StringFog.decrypt("ziCrBujn\n", "qUXfS4mXmGw=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3716 = StringFog.decrypt("JOLg59dJn/s3\n", "Q4eUt7Y7+pU=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3715 = StringFog.decrypt("XjbFXLsY7jdXMNQ=\n", "OVOxFdVrmlY=\n");

    public C1303(Field field, Object obj, InterfaceC0388 interfaceC0388) {
        this.f3730 = field;
        this.f3727 = obj;
        this.f3726 = interfaceC0388;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m5943() {
        Field field = this.f3730;
        if (field != null) {
            try {
                return field.get(this.f3727);
            } catch (Exception unused) {
                return null;
            }
        }
        if (this.f3729 == null && this.f3728 == null) {
            return null;
        }
        return this.f3727;
    }

    public C1303(Collection collection, Object obj, InterfaceC0388 interfaceC0388) {
        this.f3729 = collection;
        this.f3727 = obj;
        this.f3726 = interfaceC0388;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0947
    /* renamed from: ﾒ */
    public final Object mo5313(C1226 c1226, String str, ArrayList arrayList, C0807 c0807, C1074 c1074) {
        boolean z;
        char c;
        try {
            z = true;
            switch (str.hashCode()) {
                case -2039060844:
                    if (str.equals(f3719)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1661939189:
                    if (str.equals(f3715)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1249356250:
                    if (str.equals(f3717)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 100472786:
                    if (str.equals(f3718)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 429960040:
                    if (str.equals(f3720)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 700591008:
                    if (str.equals(f3716)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1406685743:
                    if (str.equals(f3723)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953253188:
                    if (str.equals(f3721)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1967798203:
                    if (str.equals(f3724)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058833392:
                    if (str.equals(f3722)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            AbstractC1086.m5875(c1226.m5929(), AbstractC1257.m5940("Tw==\n", "aKeCCp+218k=\n", AbstractC1196.m5920("5+JeS+OpjNbL/EkE9PGe3dfkRUr2qbTcyPVPUNfgntLG2UFU/amV39b5WkGx5J7Kyv9IBLY=\n", "opAsJJGJ+74=\n", new StringBuilder(), str)), e, null);
        }
        switch (c) {
            case 0:
                return m5943();
            case 1:
                Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
                Field field = this.f3730;
                if (field != null) {
                    try {
                        field.set(this.f3727, m5554);
                    } catch (Exception unused) {
                    }
                }
                return null;
            case 2:
                if (this.f3730 == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return this.f3730;
            case 4:
                if (this.f3729 == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return this.f3729;
            case 6:
                if (this.f3728 == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return this.f3728;
            case '\b':
                return this.f3726;
            case '\t':
                return this.f3727;
            default:
                new C0440(c1226, c1074, f3725, str).m5536(c1226.m5929());
                return null;
        }
    }

    public C1303(Map map, Object obj, InterfaceC0388 interfaceC0388) {
        this.f3728 = map;
        this.f3727 = obj;
        this.f3726 = interfaceC0388;
    }
}
