package com.instagram.common.viewpoint.core;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.1J, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C1J extends C7M {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C1J(C2930gi c2930gi) {
        super(c2930gi);
        setCarouselLayoutManager(c2930gi);
    }

    public AbstractC2001Ft getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C7M
    public C3000hr getLayoutManager() {
        return (C3000hr) super.getLayoutManager();
    }

    public R7 getOnScrollListener() {
        return new PY(this);
    }

    private void setCarouselLayoutManager(C2930gi c2930gi) {
        C3000hr c3000hr = new C3000hr(c2930gi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c3000hr.A1T(true);
        }
        super.setLayoutManager(c3000hr);
    }

    @Override // com.instagram.common.viewpoint.core.C7M
    public void setLayoutManager(R2 r2) {
    }
}
