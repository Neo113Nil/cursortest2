package com.unity3d.player;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.AccessibleObject;

/* renamed from: com.unity3d.player.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4925p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11801a;
    public final String b;
    public final String c;
    public final int d;
    public volatile AccessibleObject e;

    public C4925p(Class cls, String str, String str2) {
        this.f11801a = cls;
        this.b = str;
        this.c = str2;
        this.d = str2.hashCode() + ((str.hashCode() + ((cls.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4925p) {
            C4925p c4925p = (C4925p) obj;
            if (this.d == c4925p.d && this.c.equals(c4925p.c) && this.b.equals(c4925p.b) && this.f11801a.equals(c4925p.f11801a)) {
                return true;
            }
        }
        return false;
    }
}
