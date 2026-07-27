package com.bytedance.sdk.component.vy;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class sf {
    public static boolean pcc(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
