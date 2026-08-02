package g1;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* renamed from: g1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1976j extends C1975i {
    @Override // g1.C1975i
    public final Font U(k1.i iVar) {
        Font d5;
        Uri uri = iVar.f17572a;
        String authority = Objects.equals(uri.getScheme(), "systemfont") ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d5 = AbstractC1970d.d(create)) != null) {
                String str = iVar.f17576e;
                if (TextUtils.isEmpty(str)) {
                    return d5;
                }
                try {
                    return new Font.Builder(d5).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
