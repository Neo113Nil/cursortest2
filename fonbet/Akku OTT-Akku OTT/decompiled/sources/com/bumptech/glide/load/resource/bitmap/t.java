package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.q;
import java.io.IOException;

@RequiresApi(21)
/* loaded from: classes3.dex */
public final class t implements com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> {
    public final l a;

    public t(l lVar) {
        this.a = lVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.k
    @Nullable
    public final com.bumptech.glide.load.engine.x<Bitmap> b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        l lVar = this.a;
        return lVar.a(new q.c(parcelFileDescriptor, lVar.d, lVar.c), i, i2, iVar, l.k);
    }
}
