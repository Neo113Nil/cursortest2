package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ti {

    /* renamed from: a, reason: collision with root package name */
    public final String f5019a;

    public ti(String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.f5019a = actionName;
    }

    public final String a() {
        return this.f5019a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti) && Intrinsics.areEqual(this.f5019a, ((ti) obj).f5019a);
    }

    public int hashCode() {
        return this.f5019a.hashCode();
    }

    public String toString() {
        return "UrlActionResult(actionName=" + this.f5019a + ")";
    }
}
