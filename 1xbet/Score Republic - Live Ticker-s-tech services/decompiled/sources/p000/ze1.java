package p000;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 extends aa0 {
    @Override // p000.aa0
    /* JADX INFO: renamed from: o */
    public final Font mo165o(q40 q40Var) {
        Font fontM5795f;
        Uri uri = q40Var.f6367a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = q40Var.f6371e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM5795f = ye1.m5795f(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM5795f;
                }
                try {
                    return new Font.Builder(fontM5795f).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
