package com.google.firebase.storage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final i f12056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f12057b;

    public r(s sVar, i iVar) {
        this.f12057b = sVar;
        if (iVar != null) {
            this.f12056a = iVar;
            return;
        }
        if (sVar.isCanceled()) {
            this.f12056a = i.a(Status.f11081z);
        } else if (sVar.f12066h == 64) {
            this.f12056a = i.a(Status.f11079x);
        } else {
            this.f12056a = null;
        }
    }
}
