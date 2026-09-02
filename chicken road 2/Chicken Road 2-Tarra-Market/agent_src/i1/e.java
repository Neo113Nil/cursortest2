package i1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int min = Math.min(str.length(), str2.length());
        int i2 = 4;
        while (true) {
            if (i2 < min) {
                char charAt = str.charAt(i2);
                char charAt2 = str2.charAt(i2);
                if (charAt == charAt2) {
                    i2++;
                } else if (charAt >= charAt2) {
                    return 1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}
