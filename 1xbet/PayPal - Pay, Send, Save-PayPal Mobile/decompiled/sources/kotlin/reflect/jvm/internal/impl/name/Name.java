package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes3.dex */
public final class Name implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.name.Name> {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    private Name(java.lang.String str, boolean z) {
        if (str == null) {
            Camera2StreamConfigurationMap(0);
        }
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public final java.lang.String asString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str == null) {
            Camera2StreamConfigurationMap(1);
        }
        return str;
    }

    public final java.lang.String getIdentifier() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("not identifier: ".concat(java.lang.String.valueOf(this)));
        }
        java.lang.String asString = asString();
        if (asString == null) {
            Camera2StreamConfigurationMap(2);
        }
        return asString;
    }

    public final boolean isSpecial() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String asStringStripSpecialMarkers() {
        if (isSpecial()) {
            java.lang.String substring = asString().substring(1, asString().length() - 1);
            if (substring == null) {
                Camera2StreamConfigurationMap(3);
            }
            return substring;
        }
        java.lang.String asString = asString();
        if (asString == null) {
            Camera2StreamConfigurationMap(4);
        }
        return asString;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        return this.getHighSpeedVideoFpsRanges.compareTo(name2.getHighSpeedVideoFpsRanges);
    }

    public static kotlin.reflect.jvm.internal.impl.name.Name identifier(java.lang.String str) {
        if (str == null) {
            Camera2StreamConfigurationMap(5);
        }
        return new kotlin.reflect.jvm.internal.impl.name.Name(str, false);
    }

    public static boolean isValidIdentifier(java.lang.String str) {
        if (str == null) {
            Camera2StreamConfigurationMap(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static kotlin.reflect.jvm.internal.impl.name.Name special(java.lang.String str) {
        if (str == null) {
            Camera2StreamConfigurationMap(8);
        }
        if (!str.startsWith("<")) {
            throw new java.lang.IllegalArgumentException("special name must start with '<': ".concat(java.lang.String.valueOf(str)));
        }
        return new kotlin.reflect.jvm.internal.impl.name.Name(str, true);
    }

    public static kotlin.reflect.jvm.internal.impl.name.Name guessByFirstCharacter(java.lang.String str) {
        if (str == null) {
            Camera2StreamConfigurationMap(9);
        }
        if (str.startsWith("<")) {
            return special(str);
        }
        return identifier(str);
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.name.Name)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = (kotlin.reflect.jvm.internal.impl.name.Name) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == name2.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges.equals(name2.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + (this.getHighResolutionOutputSizeshNQ4ISI ? 1 : 0);
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
