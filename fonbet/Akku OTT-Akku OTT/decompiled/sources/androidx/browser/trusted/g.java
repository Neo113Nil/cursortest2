package androidx.browser.trusted;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareByteArrays;
        compareByteArrays = TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
        return compareByteArrays;
    }
}
