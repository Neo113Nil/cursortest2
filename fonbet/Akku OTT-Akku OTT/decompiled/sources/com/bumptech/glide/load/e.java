package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class e extends IOException {
    private static final long serialVersionUID = 1;

    public e(String str, int i, @Nullable IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
