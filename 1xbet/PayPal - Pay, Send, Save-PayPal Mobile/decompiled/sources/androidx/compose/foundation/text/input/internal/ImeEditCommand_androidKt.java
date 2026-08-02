package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a#\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0019\u0010\u000b\u001a+\u0010\u001c\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "text", "", "newCursorPosition", "", "commitText", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setComposingRegion", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "annotations", "setComposingText", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;ILjava/util/List;)V", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingText", "deleteSurroundingTextInCodePoints", "finishComposingText", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;)V", "setSelection", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "imeReplace", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/lang/CharSequence;)V", "imeDelete", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, final java.lang.String str, final int i) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.$r8$lambda$9qzgAv7AX9vRYxH6NkesWu637Z8(str, i, (androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    public static final void setComposingRegion(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.$r8$lambda$rOXqJB_cTvUBd3Yc7jwnLDyIOAs(i, i2, (androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, java.lang.String str, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i, list);
    }

    public static final void setComposingText(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, final java.lang.String str, final int i, final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.$r8$lambda$JAKxBSQReW3pF_UDj2V8BAC3oOw(str, list, i, (androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    public static final void deleteSurroundingText(final androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.m2232$r8$lambda$OkzSeqrTaaYizXA2nGh4zJI8Rg(i, i2, imeEditCommandScope, (androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.$r8$lambda$jH8CYFE1bAscT3mtZiQX0fwx_QI(i, i2, (androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    public static final void finishComposingText(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.m2234$r8$lambda$zI3AfwY9Q3xeyzdVmwtqYUgW8((androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    public static final void setSelection(final androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.m2233$r8$lambda$_XOpmSF9JbY8bGeevj_Usl6GnA(androidx.compose.foundation.text.input.internal.ImeEditCommandScope.this, i, i2, (androidx.compose.foundation.text.input.TextFieldBuffer) obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 != r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r6.commitComposition$foundation();
        r6.clearHighlight$foundation();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void imeReplace(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer, int i, int i2, java.lang.CharSequence charSequence) {
        int min = java.lang.Math.min(i, i2);
        int max = java.lang.Math.max(i, i2);
        int i3 = 0;
        int i4 = min;
        while (i4 < max && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.asCharSequence().charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (max > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(max - 1)) {
            length--;
            max--;
        }
        textFieldBuffer.replace(i4, max, charSequence.subSequence(i3, length));
        textFieldBuffer.m2175setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(min + charSequence.length()));
    }

    public static final void imeDelete(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer, int i, int i2) {
        androidx.compose.ui.text.TextRange composition = textFieldBuffer.getComposition();
        int min = java.lang.Math.min(i, i2);
        int max = java.lang.Math.max(i, i2);
        androidx.compose.foundation.text.input.TextFieldBufferKt.delete(textFieldBuffer, min, max);
        if (composition != null) {
            composition.getGetHighResolutionOutputSizeshNQ4ISI();
            long m2179adjustTextRangevJH6DeI = androidx.compose.foundation.text.input.TextFieldBufferKt.m2179adjustTextRangevJH6DeI(composition.getGetHighResolutionOutputSizeshNQ4ISI(), min, max, 0);
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2179adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation();
            } else {
                androidx.compose.foundation.text.input.TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(m2179adjustTextRangevJH6DeI), androidx.compose.ui.text.TextRange.m8036getMaximpl(m2179adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9qzgAv7AX9vRYxH6NkesWu637Z8(java.lang.String str, int i, androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        androidx.compose.ui.text.TextRange composition = textFieldBuffer.getComposition();
        if (composition != null) {
            imeReplace(textFieldBuffer, androidx.compose.ui.text.TextRange.m8039getStartimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8034getEndimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()), str);
        } else {
            imeReplace(textFieldBuffer, androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), str);
        }
        textFieldBuffer.m2175setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(kotlin.ranges.RangesKt.coerceIn(i > 0 ? (r0 + i) - 1 : (androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JAKxBSQReW3pF_UDj2V8BAC3oOw(java.lang.String str, java.util.List list, int i, androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        androidx.compose.ui.text.TextRange composition = textFieldBuffer.getComposition();
        if (composition != null) {
            java.lang.String str2 = str;
            imeReplace(textFieldBuffer, androidx.compose.ui.text.TextRange.m8039getStartimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8034getEndimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()), str2);
            if (str2.length() > 0) {
                textFieldBuffer.setComposition$foundation(androidx.compose.ui.text.TextRange.m8039getStartimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8039getStartimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()) + str.length(), list);
            }
        } else {
            int m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI());
            java.lang.String str3 = str;
            imeReplace(textFieldBuffer, m8039getStartimpl, androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), str3);
            if (str3.length() > 0) {
                textFieldBuffer.setComposition$foundation(m8039getStartimpl, str.length() + m8039getStartimpl, list);
            }
        }
        textFieldBuffer.m2175setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(kotlin.ranges.RangesKt.coerceIn(i > 0 ? (r5 + i) - 1 : (androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OkzSeqrTaaYizX-A2nGh4zJI8Rg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2232$r8$lambda$OkzSeqrTaaYizXA2nGh4zJI8Rg(int i, int i2, androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        if (i < 0 || i2 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
            sb.append(i);
            sb.append(" and ");
            sb.append(i2);
            sb.append(" respectively.");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        long mo2207mapToTransformedGEjPoXI = imeEditCommandScope.mo2207mapToTransformedGEjPoXI(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI());
        int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(mo2207mapToTransformedGEjPoXI);
        int i3 = m8034getEndimpl + i2;
        if (((i2 ^ i3) & (m8034getEndimpl ^ i3)) < 0) {
            i3 = imeEditCommandScope.getTransformedLength();
        }
        long mo2206mapFromTransformedGEjPoXI = imeEditCommandScope.mo2206mapFromTransformedGEjPoXI(androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(mo2207mapToTransformedGEjPoXI), java.lang.Math.min(i3, imeEditCommandScope.getTransformedLength())));
        imeDelete(textFieldBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(mo2206mapFromTransformedGEjPoXI), androidx.compose.ui.text.TextRange.m8036getMaximpl(mo2206mapFromTransformedGEjPoXI));
        int m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(mo2207mapToTransformedGEjPoXI);
        int i4 = m8039getStartimpl - i;
        if (((i ^ m8039getStartimpl) & (m8039getStartimpl ^ i4)) < 0) {
            i4 = 0;
        }
        long mo2206mapFromTransformedGEjPoXI2 = imeEditCommandScope.mo2206mapFromTransformedGEjPoXI(androidx.compose.ui.text.TextRangeKt.TextRange(java.lang.Math.max(0, i4), androidx.compose.ui.text.TextRange.m8039getStartimpl(mo2207mapToTransformedGEjPoXI)));
        imeDelete(textFieldBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(mo2206mapFromTransformedGEjPoXI2), androidx.compose.ui.text.TextRange.m8036getMaximpl(mo2206mapFromTransformedGEjPoXI2));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_XOpmSF9-JbY8bGeevj_Usl6GnA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2233$r8$lambda$_XOpmSF9JbY8bGeevj_Usl6GnA(androidx.compose.foundation.text.input.internal.ImeEditCommandScope imeEditCommandScope, int i, int i2, androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        long mo2207mapToTransformedGEjPoXI = imeEditCommandScope.mo2207mapToTransformedGEjPoXI(androidx.compose.ui.text.TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(mo2207mapToTransformedGEjPoXI);
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(mo2207mapToTransformedGEjPoXI);
        if (i < m8037getMinimpl) {
            i = m8037getMinimpl;
        }
        if (i <= m8036getMaximpl) {
            m8036getMaximpl = i;
        }
        int m8037getMinimpl2 = androidx.compose.ui.text.TextRange.m8037getMinimpl(mo2207mapToTransformedGEjPoXI);
        int m8036getMaximpl2 = androidx.compose.ui.text.TextRange.m8036getMaximpl(mo2207mapToTransformedGEjPoXI);
        if (i2 < m8037getMinimpl2) {
            i2 = m8037getMinimpl2;
        }
        if (i2 <= m8036getMaximpl2) {
            m8036getMaximpl2 = i2;
        }
        textFieldBuffer.m2175setSelection5zctL8(imeEditCommandScope.mo2206mapFromTransformedGEjPoXI(androidx.compose.ui.text.TextRangeKt.TextRange(m8036getMaximpl, m8036getMaximpl2)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jH8CYFE1bAscT3mtZiQX0fwx_QI(int i, int i2, androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        if (i < 0 || i2 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
            sb.append(i);
            sb.append(" and ");
            sb.append(i2);
            sb.append(" respectively.");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 < i) {
                int i6 = i4 + 1;
                if (androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) <= i6) {
                    i4 = androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI());
                    break;
                }
                i4 = (java.lang.Character.isHighSurrogate(textFieldBuffer.asCharSequence().charAt((androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) - i6) + (-1))) && java.lang.Character.isLowSurrogate(textFieldBuffer.asCharSequence().charAt(androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) - i6))) ? i4 + 2 : i6;
                i5++;
            } else {
                break;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= i2) {
                break;
            }
            int i8 = i3 + 1;
            if (androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) + i8 >= textFieldBuffer.getLength()) {
                i3 = textFieldBuffer.getLength() - androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI());
                break;
            }
            i3 = (java.lang.Character.isHighSurrogate(textFieldBuffer.asCharSequence().charAt((androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) + i8) + (-1))) && java.lang.Character.isLowSurrogate(textFieldBuffer.asCharSequence().charAt(androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) + i8))) ? i3 + 2 : i8;
            i7++;
        }
        imeDelete(textFieldBuffer, androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) + i3);
        imeDelete(textFieldBuffer, androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()) - i4, androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rOXqJB_cTvUBd3Yc7jwnLDyIOAs(int i, int i2, androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.hasComposition$foundation()) {
            textFieldBuffer.commitComposition$foundation();
        }
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(i, 0, textFieldBuffer.getLength());
        int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(i2, 0, textFieldBuffer.getLength());
        if (coerceIn != coerceIn2) {
            if (coerceIn < coerceIn2) {
                androidx.compose.foundation.text.input.TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, coerceIn, coerceIn2, null, 4, null);
            } else {
                androidx.compose.foundation.text.input.TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, coerceIn2, coerceIn, null, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zI3Afw-Y9Q3xeyzdV-mwtqYUgW8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2234$r8$lambda$zI3AfwY9Q3xeyzdVmwtqYUgW8(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.commitComposition$foundation();
        return kotlin.Unit.INSTANCE;
    }
}
