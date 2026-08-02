package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", com.daon.sdk.face.license.License.FEATURE_POSITION, "popupLength", "windowLength", "", "closeAffinity", "alignPopupAxis", "(IIIZ)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuPopupPositionProviderKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0013, code lost:
    
        if (r6 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0017, code lost:
    
        return r3 - r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int alignPopupAxis(int i, int i2, int i3, boolean z) {
        boolean z2;
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (!z) {
            if (z ? i3 - i2 > i : i2 <= i) {
                return z2 ? i : i - i2;
            }
            if (z2) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z2) {
            }
        } else if (z2) {
        }
    }

    public static /* synthetic */ int alignPopupAxis$default(int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            z = true;
        }
        return alignPopupAxis(i, i2, i3, z);
    }
}
