package com.google.android.recaptcha.internal;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a;

/* loaded from: classes4.dex */
final class zzpu extends IllegalArgumentException {
    public zzpu(int i, int i2) {
        super(a.a("Unpaired surrogate at index ", i, " of ", i2));
    }
}
