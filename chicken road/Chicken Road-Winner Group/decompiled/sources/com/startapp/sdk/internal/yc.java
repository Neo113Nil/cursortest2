package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class yc {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r0.containsKey("forceOrientation") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r0.containsKey("allowOffscreen") != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap a(String str) {
        String substring = str.substring(8);
        HashMap hashMap = new HashMap();
        int indexOf = substring.indexOf(63);
        boolean z3 = true;
        if (indexOf != -1) {
            String substring2 = substring.substring(0, indexOf);
            for (String str2 : substring.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61);
                hashMap.put(str2.substring(0, indexOf2), str2.substring(indexOf2 + 1));
            }
            substring = substring2;
        }
        if (!Arrays.asList("close", "createCalendarEvent", "expand", "open", "playVideo", "resize", "setOrientationProperties", "setResizeProperties", "storePicture", "useCustomClose").contains(substring)) {
            return null;
        }
        if (substring.equals("createCalendarEvent")) {
            z3 = hashMap.containsKey("eventJSON");
        } else if (substring.equals("open") || substring.equals("playVideo") || substring.equals("storePicture")) {
            z3 = hashMap.containsKey("url");
        } else if (substring.equals("setOrientationProperties")) {
            if (hashMap.containsKey("allowOrientationChange")) {
            }
            z3 = false;
        } else if (substring.equals("setResizeProperties")) {
            if (hashMap.containsKey("width")) {
                if (hashMap.containsKey("height")) {
                    if (hashMap.containsKey("offsetX")) {
                        if (hashMap.containsKey("offsetY")) {
                            if (hashMap.containsKey("customClosePosition")) {
                            }
                        }
                    }
                }
            }
            z3 = false;
        } else if (substring.equals("useCustomClose")) {
            z3 = hashMap.containsKey("useCustomClose");
        }
        if (!z3) {
            return null;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("command", substring);
        hashMap2.putAll(hashMap);
        return hashMap2;
    }
}
