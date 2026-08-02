package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\tj\u0002`\n2\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "p0", "", "Camera2StreamConfigurationMap", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "", "getHighSpeedVideoFpsRanges", "(Landroid/os/Bundle;)I", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Bundle;Ljava/lang/StringBuilder;Ljava/util/List;)V"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateReaderKt")
/* renamed from: androidx.savedstate.SavedStateReaderKt__SavedStateReader_androidKt, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
final /* synthetic */ class Bundle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            java.lang.Object obj2 = bundle2.get(str);
            if (obj != obj2 && !kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof android.os.Bundle) && (obj2 instanceof android.os.Bundle)) {
                        if (!Camera2StreamConfigurationMap((android.os.Bundle) obj, (android.os.Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                        if (!kotlin.collections.ArraysKt.contentDeepEquals((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(android.os.Bundle bundle) {
        int hashCode;
        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object obj = bundle.get(it.next());
            if (obj instanceof android.os.Bundle) {
                hashCode = getHighSpeedVideoFpsRanges((android.os.Bundle) obj);
            } else if (obj instanceof java.lang.Object[]) {
                hashCode = kotlin.collections.ArraysKt.contentDeepHashCode((java.lang.Object[]) obj);
            } else if (obj instanceof byte[]) {
                hashCode = java.util.Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                hashCode = java.util.Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                hashCode = java.util.Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                hashCode = java.util.Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                hashCode = java.util.Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                hashCode = java.util.Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                hashCode = java.util.Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                hashCode = java.util.Arrays.hashCode((boolean[]) obj);
            } else {
                hashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + hashCode;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(android.os.Bundle bundle, java.lang.StringBuilder sb, java.util.List<android.os.Bundle> list) {
        if (list.contains(bundle)) {
            sb.append("[...]");
            return;
        }
        list.add(bundle);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int i = 0;
        for (java.lang.String str : bundle.keySet()) {
            if (i != 0) {
                sb.append(", ");
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append('=');
            sb.append(sb2.toString());
            java.lang.Object obj = bundle.get(str);
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof android.os.Bundle) {
                getHighSpeedVideoFpsRangesFor((android.os.Bundle) obj, sb, list);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else if (obj instanceof java.lang.Object[]) {
                sb.append(kotlin.collections.ArraysKt.contentDeepToString((java.lang.Object[]) obj));
            } else if (obj instanceof byte[]) {
                java.lang.String arrays = java.util.Arrays.toString((byte[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
                sb.append(arrays);
            } else if (obj instanceof short[]) {
                java.lang.String arrays2 = java.util.Arrays.toString((short[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays2, "");
                sb.append(arrays2);
            } else if (obj instanceof int[]) {
                java.lang.String arrays3 = java.util.Arrays.toString((int[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays3, "");
                sb.append(arrays3);
            } else if (obj instanceof long[]) {
                java.lang.String arrays4 = java.util.Arrays.toString((long[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays4, "");
                sb.append(arrays4);
            } else if (obj instanceof float[]) {
                java.lang.String arrays5 = java.util.Arrays.toString((float[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays5, "");
                sb.append(arrays5);
            } else if (obj instanceof double[]) {
                java.lang.String arrays6 = java.util.Arrays.toString((double[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays6, "");
                sb.append(arrays6);
            } else if (obj instanceof char[]) {
                java.lang.String arrays7 = java.util.Arrays.toString((char[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays7, "");
                sb.append(arrays7);
            } else if (obj instanceof boolean[]) {
                java.lang.String arrays8 = java.util.Arrays.toString((boolean[]) obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays8, "");
                sb.append(arrays8);
            } else {
                sb.append(obj.toString());
            }
            i++;
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        list.remove(kotlin.collections.CollectionsKt.getLastIndex(list));
    }
}
