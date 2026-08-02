package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class CharSequenceUtils {
    static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i) {
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).regionMatches(false, 0, (java.lang.String) charSequence2, 0, i);
        }
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i3)) {
                return false;
            }
            i2++;
            i--;
            i3++;
        }
        return true;
    }
}
