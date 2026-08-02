package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\tJ;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/miteksystems/misnap/controller/a/k;", "", "", "isRotatedBy180", "usePortraitOrientation", "", "a", "(ZZ)I", "cameraDegrees", "(I)Z", "", "", "fourCorners", "rotationDegrees", "width", "height", "([[IIII)[[I", "<init>", "()V", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.miteksystems.misnap.controller.a.k f3989a = new com.miteksystems.misnap.controller.a.k();

    public final /* synthetic */ int a(boolean isRotatedBy180, boolean usePortraitOrientation) {
        int i = isRotatedBy180 ? com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0;
        return usePortraitOrientation ? i + 90 : i;
    }

    public final /* synthetic */ boolean a(int cameraDegrees) {
        return cameraDegrees >= 180;
    }

    public final /* synthetic */ int[][] a(int[][] fourCorners, int rotationDegrees, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fourCorners, "");
        if (rotationDegrees == 90) {
            for (int i = 0; i < 4; i++) {
                int[] iArr = fourCorners[i];
                fourCorners[i] = new int[]{height - iArr[1], iArr[0]};
            }
        } else if (rotationDegrees == 180) {
            for (int i2 = 0; i2 < 4; i2++) {
                int[] iArr2 = fourCorners[i2];
                fourCorners[i2] = new int[]{width - iArr2[0], height - iArr2[1]};
            }
        } else if (rotationDegrees == 270) {
            for (int i3 = 0; i3 < 4; i3++) {
                int[] iArr3 = fourCorners[i3];
                fourCorners[i3] = new int[]{iArr3[1], width - iArr3[0]};
            }
        }
        return fourCorners;
    }

    private k() {
    }
}
