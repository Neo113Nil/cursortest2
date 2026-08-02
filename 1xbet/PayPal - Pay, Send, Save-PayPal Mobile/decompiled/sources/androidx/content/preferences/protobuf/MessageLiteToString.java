package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class MessageLiteToString {
    private static final char[] getHighSpeedVideoFpsRanges;

    static {
        char[] cArr = new char[80];
        getHighSpeedVideoFpsRanges = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    static java.lang.String getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.MessageLite messageLite, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        getHighSpeedVideoFpsRanges(messageLite, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        if (r5.containsKey(r13.toString()) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.MessageLite messageLite, java.lang.StringBuilder sb, int i) {
        int i2;
        int i3;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String substring = ((java.lang.String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                getHighSpeedVideoFpsRangesFor(sb, i, substring.substring(0, substring.length() - 4), androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRanges(method2, messageLite, new java.lang.Object[0]));
                i2 = 3;
            } else {
                if (substring.endsWith("Map") && !substring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    getHighSpeedVideoFpsRangesFor(sb, i, substring.substring(0, substring.length() - 3), androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRanges(method, messageLite, new java.lang.Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set".concat(java.lang.String.valueOf(substring)))) {
                        if (substring.endsWith("Bytes")) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("get");
                            sb2.append(substring.substring(0, substring.length() - 5));
                        }
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                        if (method4 != null) {
                            java.lang.Object highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRanges(method4, messageLite, new java.lang.Object[0]);
                            if (method5 != null ? ((java.lang.Boolean) androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRanges(method5, messageLite, new java.lang.Object[0])).booleanValue() : !getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges)) {
                                getHighSpeedVideoFpsRangesFor(sb, i, substring, highSpeedVideoFpsRanges);
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (messageLite instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) {
            java.util.Iterator<java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> inputSizeshNQ4ISI = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite).extensions.getInputSizeshNQ4ISI();
            while (inputSizeshNQ4ISI.hasNext()) {
                java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next = inputSizeshNQ4ISI.next();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[");
                sb3.append(next.getKey().getNumber());
                sb3.append("]");
                getHighSpeedVideoFpsRangesFor(sb, i, sb3.toString(), next.getValue());
            }
        }
        androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.getHighResolutionOutputSizeshNQ4ISI(sb, i);
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return !((java.lang.Boolean) obj).booleanValue();
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue() == 0;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()) == 0;
        }
        if (obj instanceof java.lang.Double) {
            return java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof java.lang.String) {
            return obj.equals("");
        }
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            return obj.equals(androidx.content.preferences.protobuf.ByteString.EMPTY);
        }
        return obj instanceof androidx.content.preferences.protobuf.MessageLite ? obj == ((androidx.content.preferences.protobuf.MessageLite) obj).getDefaultInstanceForType() : (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRangesFor(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                getHighSpeedVideoFpsRangesFor(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        getHighSpeedVideoSizes(i, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (java.lang.Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(androidx.content.preferences.protobuf.TextFormatEscaper.getHighResolutionOutputSizeshNQ4ISI((java.lang.String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            sb.append(": \"");
            sb.append(androidx.content.preferences.protobuf.TextFormatEscaper.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) {
            sb.append(" {");
            getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.GeneratedMessageLite) obj, sb, i + 2);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            getHighSpeedVideoSizes(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof java.util.Map.Entry) {
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int i3 = i + 2;
            getHighSpeedVideoFpsRangesFor(sb, i3, "key", entry.getKey());
            getHighSpeedVideoFpsRangesFor(sb, i3, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, entry.getValue());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            getHighSpeedVideoSizes(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            char[] cArr = getHighSpeedVideoFpsRanges;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }
}
