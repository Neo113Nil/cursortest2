package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0011"}, d2 = {"", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/runtime/tooling/SourceInformation;", "parseSourceInformation", "(Ljava/lang/String;)Landroidx/compose/runtime/tooling/SourceInformation;", "parseSourceInformationInternal", "Landroidx/compose/runtime/tooling/SourceInfoParserState;", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/runtime/tooling/SourceInfoParserState;)Z", "", "Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "getHighSpeedVideoSizes", "(Landroidx/compose/runtime/tooling/SourceInfoParserState;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/tooling/LocationSourceInformation;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceInformationKt {
    public static final androidx.compose.runtime.tooling.SourceInformation parseSourceInformation(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return parseSourceInformationInternal(str);
        } catch (androidx.compose.runtime.tooling.ParseException e) {
            androidx.compose.runtime.internal.Utils_androidKt.logError(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.runtime.tooling.SourceInformation parseSourceInformationInternal(java.lang.String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String str2;
        androidx.compose.runtime.tooling.SourceInfoParserState sourceInfoParserState = new androidx.compose.runtime.tooling.SourceInfoParserState(str);
        java.lang.String str3 = null;
        if (sourceInfoParserState.getHighSpeedVideoFpsRanges('C')) {
            sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
            z2 = true;
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges('C')) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                z = true;
            } else {
                z = false;
            }
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges('(')) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                java.lang.String highSpeedVideoFpsRanges = sourceInfoParserState.getHighSpeedVideoFpsRanges(")");
                sourceInfoParserState.Camera2StreamConfigurationMap();
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                z3 = z;
                z4 = true;
                str2 = highSpeedVideoFpsRanges;
                java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> emptyList = kotlin.collections.CollectionsKt.emptyList();
                while (getHighSpeedVideoFpsRangesFor(sourceInfoParserState)) {
                    char highSpeedVideoFpsRangesFor = sourceInfoParserState.getHighSpeedVideoFpsRangesFor();
                    if (highSpeedVideoFpsRangesFor == 'N') {
                        emptyList = getHighSpeedVideoFpsRanges(sourceInfoParserState);
                    } else if (highSpeedVideoFpsRangesFor == 'P') {
                        emptyList = getHighSpeedVideoSizes(sourceInfoParserState);
                    } else {
                        sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(2);
                        int i = 0;
                        while (true) {
                            if (i > 0 || !sourceInfoParserState.getHighSpeedVideoFpsRanges(')')) {
                                if (sourceInfoParserState.getHighSpeedVideoFpsRanges()) {
                                    sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI("unexpected end");
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                if (sourceInfoParserState.getHighSpeedVideoFpsRanges('(')) {
                                    i++;
                                } else if (sourceInfoParserState.getHighSpeedVideoFpsRanges(')')) {
                                    i--;
                                }
                                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                            } else {
                                sourceInfoParserState.Camera2StreamConfigurationMap();
                                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                                break;
                            }
                        }
                    }
                }
                java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                if (!sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                    sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                } else {
                    emptyList2 = Camera2StreamConfigurationMap(sourceInfoParserState);
                }
                java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> list = emptyList2;
                java.lang.String highSpeedVideoFpsRanges2 = sourceInfoParserState.getHighSpeedVideoFpsRanges("#");
                java.lang.String str4 = highSpeedVideoFpsRanges2.length() > 0 ? null : highSpeedVideoFpsRanges2;
                if (sourceInfoParserState.getHighSpeedVideoFpsRanges('#')) {
                    sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                    str3 = sourceInfoParserState.getInputFormats();
                }
                return new androidx.compose.runtime.tooling.SourceInformation(z4, z3, str2, str4, emptyList, str3, list, str);
            }
        } else {
            z = false;
            z2 = false;
        }
        z3 = z;
        z4 = z2;
        str2 = null;
        java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> emptyList3 = kotlin.collections.CollectionsKt.emptyList();
        while (getHighSpeedVideoFpsRangesFor(sourceInfoParserState)) {
        }
        java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> emptyList22 = kotlin.collections.CollectionsKt.emptyList();
        if (!sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
        }
        java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> list2 = emptyList22;
        java.lang.String highSpeedVideoFpsRanges22 = sourceInfoParserState.getHighSpeedVideoFpsRanges("#");
        if (highSpeedVideoFpsRanges22.length() > 0) {
        }
        if (sourceInfoParserState.getHighSpeedVideoFpsRanges('#')) {
        }
        return new androidx.compose.runtime.tooling.SourceInformation(z4, z3, str2, str4, emptyList3, str3, list2, str);
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.tooling.SourceInfoParserState sourceInfoParserState) {
        return sourceInfoParserState.getGetHighSpeedVideoFpsRanges() < sourceInfoParserState.getCamera2StreamConfigurationMap().length() - 1 && java.lang.Character.isLetter(sourceInfoParserState.getCamera2StreamConfigurationMap().charAt(sourceInfoParserState.getGetHighSpeedVideoFpsRanges())) && sourceInfoParserState.getCamera2StreamConfigurationMap().charAt(sourceInfoParserState.getGetHighSpeedVideoFpsRanges() + 1) == '(';
    }

    private static final java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> getHighSpeedVideoSizes(androidx.compose.runtime.tooling.SourceInfoParserState sourceInfoParserState) {
        java.lang.String str;
        sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = false;
        while (!sourceInfoParserState.getHighSpeedVideoFpsRanges() && !sourceInfoParserState.getHighSpeedVideoFpsRanges(')')) {
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges('!')) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                java.lang.String highSpeedVideoFpsRanges = sourceInfoParserState.getHighSpeedVideoFpsRanges("!,)");
                if (highSpeedVideoFpsRanges.length() != 0) {
                    int parseInt = java.lang.Integer.parseInt(highSpeedVideoFpsRanges);
                    int i = 0;
                    while (parseInt > 0) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                if (((androidx.compose.runtime.tooling.ParameterSourceInformation) arrayList.get(i2)).getSortedIndex() == i) {
                                    i++;
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList.add(new androidx.compose.runtime.tooling.ParameterSourceInformation(i, null, null, 6, null));
                                parseInt--;
                                break;
                            }
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int highSpeedVideoFpsRangesFor = sourceInfoParserState.getHighSpeedVideoFpsRangesFor("!:,)");
                if (sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                    sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                    str = getHighSpeedVideoFpsRanges(sourceInfoParserState.getHighSpeedVideoFpsRanges("!,)"));
                } else {
                    str = null;
                }
                java.lang.String str2 = str;
                if (z) {
                    int i3 = 0;
                    while (i3 < highSpeedVideoFpsRangesFor) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size2) {
                                if (((androidx.compose.runtime.tooling.ParameterSourceInformation) arrayList.get(i4)).getSortedIndex() == i3) {
                                    i3++;
                                    break;
                                }
                                i4++;
                            } else {
                                arrayList.add(new androidx.compose.runtime.tooling.ParameterSourceInformation(i3, null, null, 6, null));
                                break;
                            }
                        }
                    }
                    z = false;
                }
                arrayList.add(new androidx.compose.runtime.tooling.ParameterSourceInformation(highSpeedVideoFpsRangesFor, null, str2, 2, null));
            }
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
            }
        }
        sourceInfoParserState.Camera2StreamConfigurationMap();
        sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
        return arrayList;
    }

    private static final java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> getHighSpeedVideoFpsRanges(androidx.compose.runtime.tooling.SourceInfoParserState sourceInfoParserState) {
        java.lang.String str;
        sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!sourceInfoParserState.getHighSpeedVideoFpsRanges() && !sourceInfoParserState.getHighSpeedVideoFpsRanges(')')) {
            java.lang.String highSpeedVideoFpsRanges = sourceInfoParserState.getHighSpeedVideoFpsRanges(":,)");
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                str = getHighSpeedVideoFpsRanges(sourceInfoParserState.getHighSpeedVideoFpsRanges(",)"));
            } else {
                str = null;
            }
            arrayList.add(new androidx.compose.runtime.tooling.ParameterSourceInformation(arrayList.size(), highSpeedVideoFpsRanges, str));
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
            }
        }
        sourceInfoParserState.Camera2StreamConfigurationMap();
        sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
        return arrayList;
    }

    private static final java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> Camera2StreamConfigurationMap(androidx.compose.runtime.tooling.SourceInfoParserState sourceInfoParserState) {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!sourceInfoParserState.getHighSpeedVideoFpsRanges() && !sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges('*')) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                z = true;
            } else {
                z = false;
            }
            java.lang.Integer num = null;
            java.lang.Integer valueOf = !sourceInfoParserState.getHighSpeedVideoFpsRanges('@') ? java.lang.Integer.valueOf(sourceInfoParserState.getHighSpeedVideoFpsRangesFor("@") + 1) : null;
            sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
            int highSpeedVideoFpsRangesFor = sourceInfoParserState.getHighSpeedVideoFpsRangesFor("L,:");
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT)) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
                num = java.lang.Integer.valueOf(sourceInfoParserState.getHighSpeedVideoFpsRangesFor(",:"));
            }
            arrayList.add(new androidx.compose.runtime.tooling.LocationSourceInformation(valueOf != null ? valueOf.intValue() : -1, highSpeedVideoFpsRangesFor, num != null ? num.intValue() : -1, z));
            if (sourceInfoParserState.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)) {
                sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
            }
        }
        sourceInfoParserState.getHighResolutionOutputSizeshNQ4ISI(1);
        return arrayList;
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        return kotlin.text.StringsKt.replaceFirst$default(str, "c#", "androidx.compose.", false, 4, (java.lang.Object) null);
    }
}
