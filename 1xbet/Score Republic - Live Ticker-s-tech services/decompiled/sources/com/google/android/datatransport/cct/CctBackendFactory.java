package com.google.android.datatransport.cct;

import android.content.Context;
import p000.AbstractC0698sn;
import p000.C0542of;
import p000.C0795v9;
import p000.me1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public me1 create(AbstractC0698sn abstractC0698sn) {
        Context context = ((C0795v9) abstractC0698sn).f8134a;
        C0795v9 c0795v9 = (C0795v9) abstractC0698sn;
        return new C0542of(context, c0795v9.f8135b, c0795v9.f8136c);
    }
}
