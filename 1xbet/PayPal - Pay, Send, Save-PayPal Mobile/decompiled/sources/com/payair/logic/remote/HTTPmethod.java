package com.payair.logic.remote;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/payair/logic/remote/HTTPmethod;", "", "", "a", com.visa.cbp.getEncExpo.warmup, "getType", "()I", "type", com.datadog.android.internal.network.HttpSpec.Method.DELETE, "POST", com.datadog.android.internal.network.HttpSpec.Method.PUT, "GET"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HTTPmethod {
    public static final com.payair.logic.remote.HTTPmethod DELETE;
    public static final com.payair.logic.remote.HTTPmethod GET;
    public static final com.payair.logic.remote.HTTPmethod POST;
    public static final com.payair.logic.remote.HTTPmethod PUT;
    public static final /* synthetic */ com.payair.logic.remote.HTTPmethod[] b;
    public static final /* synthetic */ kotlin.enums.EnumEntries c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int type;

    static {
        com.payair.logic.remote.HTTPmethod hTTPmethod = new com.payair.logic.remote.HTTPmethod(com.datadog.android.internal.network.HttpSpec.Method.DELETE, 0, 3);
        DELETE = hTTPmethod;
        com.payair.logic.remote.HTTPmethod hTTPmethod2 = new com.payair.logic.remote.HTTPmethod("POST", 1, 2);
        POST = hTTPmethod2;
        com.payair.logic.remote.HTTPmethod hTTPmethod3 = new com.payair.logic.remote.HTTPmethod(com.datadog.android.internal.network.HttpSpec.Method.PUT, 2, 1);
        PUT = hTTPmethod3;
        com.payair.logic.remote.HTTPmethod hTTPmethod4 = new com.payair.logic.remote.HTTPmethod("GET", 3, 0);
        GET = hTTPmethod4;
        com.payair.logic.remote.HTTPmethod[] hTTPmethodArr = {hTTPmethod, hTTPmethod2, hTTPmethod3, hTTPmethod4};
        b = hTTPmethodArr;
        c = kotlin.enums.EnumEntriesKt.enumEntries(hTTPmethodArr);
    }

    public HTTPmethod(java.lang.String str, int i, int i2) {
        this.type = i2;
    }

    public final int getType() {
        return this.type;
    }

    public static com.payair.logic.remote.HTTPmethod[] values() {
        return (com.payair.logic.remote.HTTPmethod[]) b.clone();
    }

    public static com.payair.logic.remote.HTTPmethod valueOf(java.lang.String str) {
        return (com.payair.logic.remote.HTTPmethod) java.lang.Enum.valueOf(com.payair.logic.remote.HTTPmethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.remote.HTTPmethod> getEntries() {
        return c;
    }
}
