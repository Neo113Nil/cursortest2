package org.betup.utils;

import java.util.List;

/* loaded from: classes4.dex */
public final class Convertor {
    private static final int MAX_VALUE = 1825361152;

    public static int maxIntFromLong(long value) {
        return value < 1825361152 ? (int) value : MAX_VALUE;
    }

    private Convertor() {
    }

    public static String longArrayToString(long[] ids) {
        if (ids == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (ids.length == 0) {
            return sb.toString();
        }
        for (int i = 0; i < ids.length - 1; i++) {
            sb.append(ids[i]);
            sb.append(",");
        }
        sb.append(ids[ids.length - 1]);
        return sb.toString();
    }

    public static String intArrayToString(int[] ids) {
        StringBuilder sb = new StringBuilder();
        if (ids.length == 0) {
            return sb.toString();
        }
        for (int i = 0; i < ids.length - 1; i++) {
            sb.append(ids[i]);
            sb.append(",");
        }
        sb.append(ids[ids.length - 1]);
        return sb.toString();
    }

    public static int[] integerToInt(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }
}
