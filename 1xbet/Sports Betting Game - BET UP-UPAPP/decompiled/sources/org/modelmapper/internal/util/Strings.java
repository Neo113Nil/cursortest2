package org.modelmapper.internal.util;

import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
public final class Strings {
    private Strings() {
    }

    public static String join(List<? extends PropertyInfo> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<? extends PropertyInfo> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        return sb.toString();
    }

    public static String joinMembers(List<? extends PropertyInfo> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            PropertyInfo propertyInfo = list.get(i);
            if (i > 0) {
                sb.append("/");
            }
            sb.append(Types.toString(propertyInfo.getMember()));
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.modelmapper.spi.PropertyInfo] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    public static String joinWithFirstType(List<? extends PropertyInfo> list) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (PropertyInfo propertyInfo : list) {
            StringBuilder append = sb.append(str);
            if (!str.equals("")) {
                propertyInfo = propertyInfo.getName();
            }
            append.append(propertyInfo);
            str = ".";
        }
        return sb.toString();
    }

    public static String decapitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return String.valueOf(charArray);
    }
}
