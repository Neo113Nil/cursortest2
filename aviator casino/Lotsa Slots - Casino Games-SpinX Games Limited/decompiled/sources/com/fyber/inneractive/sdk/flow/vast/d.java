package com.fyber.inneractive.sdk.flow.vast;

/* loaded from: classes3.dex */
public final class d implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3762a;
    public final float b;

    public d(int i, int i2) {
        int i3 = i * i2;
        this.f3762a = i3;
        float f = i / i2;
        this.b = f;
        com.fyber.inneractive.sdk.util.IAlog.a("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Float.valueOf(f));
        com.fyber.inneractive.sdk.util.IAlog.d("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Float.valueOf(f));
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) obj;
        com.fyber.inneractive.sdk.model.vast.c cVar2 = (com.fyber.inneractive.sdk.model.vast.c) obj2;
        int a2 = com.fyber.inneractive.sdk.util.v.a(cVar.h, cVar2.h);
        if (a2 != 0) {
            return a2;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar = cVar.f3800a;
        com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Html;
        int i = 3;
        int i2 = iVar == iVar2 ? 1 : iVar == com.fyber.inneractive.sdk.model.vast.i.Iframe ? 2 : iVar == com.fyber.inneractive.sdk.model.vast.i.Static ? 3 : Integer.MAX_VALUE;
        com.fyber.inneractive.sdk.model.vast.i iVar3 = cVar2.f3800a;
        if (iVar3 == iVar2) {
            i = 1;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i = 2;
        } else if (iVar3 != com.fyber.inneractive.sdk.model.vast.i.Static) {
            i = Integer.MAX_VALUE;
        }
        int a3 = com.fyber.inneractive.sdk.util.v.a(i2, i);
        if (a3 != 0) {
            return a3;
        }
        int compare = java.lang.Float.compare(java.lang.Math.abs((cVar.c / cVar.d) - this.b), java.lang.Math.abs((cVar2.c / cVar2.d) - this.b));
        if (compare != 0) {
            return compare;
        }
        return com.fyber.inneractive.sdk.util.v.a(java.lang.Math.abs((cVar.c * cVar.d) - this.f3762a), java.lang.Math.abs((cVar2.c * cVar2.d) - this.f3762a));
    }
}
