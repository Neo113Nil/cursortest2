package com.razorpay;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements OnApplyWindowInsetsListener {
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat lambda$createContainer$0;
        lambda$createContainer$0 = BaseCheckoutActivity.lambda$createContainer$0(view, windowInsetsCompat);
        return lambda$createContainer$0;
    }
}
