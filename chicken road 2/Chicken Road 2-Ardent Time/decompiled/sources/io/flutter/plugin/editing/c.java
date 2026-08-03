package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class c extends android.view.inputmethod.BaseInputConnection implements io.flutter.plugin.editing.e {

    /* renamed from: a, reason: collision with root package name */
    public final P0.t f7684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7685b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f7686c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.editing.f f7687d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.inputmethod.EditorInfo f7688e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.inputmethod.ExtractedTextRequest f7689f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7690g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.inputmethod.CursorAnchorInfo.Builder f7691h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.inputmethod.ExtractedText f7692i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f7693j;

    /* renamed from: k, reason: collision with root package name */
    public final android.text.DynamicLayout f7694k;

    /* renamed from: l, reason: collision with root package name */
    public final Z0.h f7695l;

    /* renamed from: m, reason: collision with root package name */
    public final I0.b f7696m;

    /* renamed from: n, reason: collision with root package name */
    public int f7697n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(P0.t tVar, int i2, x0.e eVar, I0.b bVar, io.flutter.plugin.editing.f fVar, android.view.inputmethod.EditorInfo editorInfo) {
        super(tVar, true);
        io.flutter.embedding.engine.FlutterJNI flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
        this.f7690g = false;
        this.f7692i = new android.view.inputmethod.ExtractedText();
        this.f7697n = 0;
        this.f7684a = tVar;
        this.f7685b = i2;
        this.f7686c = eVar;
        this.f7687d = fVar;
        fVar.a(this);
        this.f7688e = editorInfo;
        this.f7696m = bVar;
        this.f7695l = new Z0.h(22, flutterJNI);
        this.f7694k = new android.text.DynamicLayout(fVar, new android.text.TextPaint(), Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7693j = (android.view.inputmethod.InputMethodManager) tVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z2) {
        io.flutter.plugin.editing.f fVar = this.f7687d;
        fVar.getClass();
        this.f7693j.updateSelection(this.f7684a, android.text.Selection.getSelectionStart(fVar), android.text.Selection.getSelectionEnd(fVar), android.view.inputmethod.BaseInputConnection.getComposingSpanStart(fVar), android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(fVar));
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = this.f7689f;
        android.view.inputmethod.InputMethodManager inputMethodManager = this.f7693j;
        P0.t tVar = this.f7684a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(tVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f7690g) {
            inputMethodManager.updateCursorAnchorInfo(tVar, b());
        }
    }

    public final android.view.inputmethod.CursorAnchorInfo b() {
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.f7691h;
        if (builder == null) {
            this.f7691h = new android.view.inputmethod.CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        android.view.inputmethod.CursorAnchorInfo.Builder builder2 = this.f7691h;
        io.flutter.plugin.editing.f fVar = this.f7687d;
        fVar.getClass();
        int selectionStart = android.text.Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, android.text.Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f7691h.setComposingText(-1, "");
        } else {
            this.f7691h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f7691h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f7687d.b();
        this.f7697n++;
        return super.beginBatchEdit();
    }

    public final android.view.inputmethod.ExtractedText c(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        android.view.inputmethod.ExtractedText extractedText = this.f7692i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        java.lang.CharSequence charSequence = this.f7687d;
        charSequence.getClass();
        extractedText.selectionStart = android.text.Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = android.text.Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f7687d.e(this);
        while (this.f7697n > 0) {
            endBatchEdit();
            this.f7697n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i2, android.os.Bundle bundle) {
        int i3;
        if ((i2 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    android.net.Uri contentUri = inputContentInfo.getContentUri();
                    java.lang.String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    android.content.Context context = this.f7684a.getContext();
                    if (contentUri != null) {
                        try {
                            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i3 = openInputStream.read(bArr);
                                    } catch (java.io.IOException unused) {
                                        i3 = -1;
                                    }
                                    if (i3 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        java.util.HashMap hashMap = new java.util.HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        x0.e eVar = this.f7686c;
                                        eVar.getClass();
                                        ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(this.f7685b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i3);
                                }
                            }
                        } catch (java.io.FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (java.lang.Exception unused3) {
            }
        }
        return false;
    }

    public final boolean d(boolean z2, boolean z3) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i2;
        int i3;
        int charCount7;
        io.flutter.plugin.editing.f fVar = this.f7687d;
        int selectionStart = android.text.Selection.getSelectionStart(fVar);
        int selectionEnd = android.text.Selection.getSelectionEnd(fVar);
        int i4 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        Z0.h hVar = this.f7695l;
        if (z2) {
            hVar.getClass();
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = java.lang.Character.charCount((codePointBefore = java.lang.Character.codePointBefore(fVar, selectionEnd))))) != 0) {
                if (codePointBefore != 10) {
                    io.flutter.embedding.engine.FlutterJNI flutterJNI = (io.flutter.embedding.engine.FlutterJNI) hVar.f1903b;
                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                        int codePointBefore2 = java.lang.Character.codePointBefore(fVar, charCount6);
                        int charCount8 = charCount6 - java.lang.Character.charCount(codePointBefore2);
                        int i5 = 1;
                        while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                            codePointBefore2 = java.lang.Character.codePointBefore(fVar, charCount8);
                            charCount8 -= java.lang.Character.charCount(codePointBefore2);
                            i5++;
                        }
                        if (i5 % 2 == 0) {
                            charCount5 += 2;
                        }
                    } else if (codePointBefore == 8419) {
                        int codePointBefore3 = java.lang.Character.codePointBefore(fVar, charCount6);
                        int charCount9 = charCount6 - java.lang.Character.charCount(codePointBefore3);
                        if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                            int codePointBefore4 = java.lang.Character.codePointBefore(fVar, charCount9);
                            if (Z0.h.p(codePointBefore4)) {
                                charCount7 = java.lang.Character.charCount(codePointBefore4) + java.lang.Character.charCount(codePointBefore3);
                                charCount5 += charCount7;
                            }
                        } else if (Z0.h.p(codePointBefore3)) {
                            charCount7 = java.lang.Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else {
                        if (codePointBefore == 917631) {
                            int codePointBefore5 = java.lang.Character.codePointBefore(fVar, charCount6);
                            charCount6 -= java.lang.Character.charCount(codePointBefore5);
                            codePointBefore = codePointBefore5;
                            while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                                charCount5 += java.lang.Character.charCount(codePointBefore);
                                codePointBefore = java.lang.Character.codePointBefore(fVar, charCount6);
                                charCount6 -= java.lang.Character.charCount(codePointBefore);
                            }
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += java.lang.Character.charCount(codePointBefore);
                            } else {
                                i3 = selectionEnd - 2;
                            }
                        }
                        if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                            codePointBefore = java.lang.Character.codePointBefore(fVar, charCount6);
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += java.lang.Character.charCount(codePointBefore);
                                charCount6 -= charCount5;
                            }
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            boolean z4 = false;
                            int i6 = 0;
                            while (true) {
                                if (z4) {
                                    charCount5 = java.lang.Character.charCount(codePointBefore) + i6 + 1 + charCount5;
                                    z4 = false;
                                }
                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                    int codePointBefore6 = java.lang.Character.codePointBefore(fVar, charCount6);
                                    int charCount10 = charCount6 - java.lang.Character.charCount(codePointBefore6);
                                    if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                        i2 = 0;
                                    } else {
                                        codePointBefore6 = java.lang.Character.codePointBefore(fVar, charCount10);
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            i2 = java.lang.Character.charCount(codePointBefore6);
                                            java.lang.Character.charCount(codePointBefore6);
                                        }
                                    }
                                    if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                        charCount5 += java.lang.Character.charCount(codePointBefore6) + i2;
                                    }
                                } else {
                                    if (charCount6 > 0) {
                                        int codePointBefore7 = java.lang.Character.codePointBefore(fVar, charCount6);
                                        charCount6 -= java.lang.Character.charCount(codePointBefore7);
                                        if (codePointBefore7 == 8205) {
                                            int codePointBefore8 = java.lang.Character.codePointBefore(fVar, charCount6);
                                            charCount6 -= java.lang.Character.charCount(codePointBefore8);
                                            if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                                i6 = 0;
                                            } else {
                                                codePointBefore8 = java.lang.Character.codePointBefore(fVar, charCount6);
                                                i6 = java.lang.Character.charCount(codePointBefore8);
                                                charCount6 -= java.lang.Character.charCount(codePointBefore8);
                                            }
                                            codePointBefore = codePointBefore8;
                                            z4 = true;
                                            if (charCount6 != 0 || !z4 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            codePointBefore = codePointBefore7;
                                        }
                                    }
                                    i6 = 0;
                                    if (charCount6 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (java.lang.Character.codePointBefore(fVar, charCount6) == 13) {
                    charCount5++;
                }
                i3 = selectionEnd - charCount5;
            } else {
                i3 = 0;
            }
            min = java.lang.Math.max(i3, 0);
        } else {
            hVar.getClass();
            int length = fVar.length();
            int i7 = length - 1;
            if (selectionEnd >= i7) {
                i4 = length;
            } else {
                int codePointAt = java.lang.Character.codePointAt(fVar, selectionEnd);
                int charCount11 = java.lang.Character.charCount(codePointAt);
                int i8 = selectionEnd + charCount11;
                if (i8 != 0) {
                    if (codePointAt != 10) {
                        io.flutter.embedding.engine.FlutterJNI flutterJNI2 = (io.flutter.embedding.engine.FlutterJNI) hVar.f1903b;
                        if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                            if (Z0.h.p(codePointAt)) {
                                charCount11 += java.lang.Character.charCount(codePointAt);
                            }
                            if (codePointAt == 8419) {
                                int codePointBefore9 = java.lang.Character.codePointBefore(fVar, i8);
                                int charCount12 = java.lang.Character.charCount(codePointBefore9) + i8;
                                if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                    int codePointAt2 = java.lang.Character.codePointAt(fVar, charCount12);
                                    if (Z0.h.p(codePointAt2)) {
                                        charCount2 = java.lang.Character.charCount(codePointBefore9);
                                        charCount3 = java.lang.Character.charCount(codePointAt2);
                                        charCount11 += charCount3 + charCount2;
                                    }
                                } else if (Z0.h.p(codePointBefore9)) {
                                    charCount = java.lang.Character.charCount(codePointBefore9);
                                    charCount11 += charCount;
                                }
                            } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                                boolean z5 = false;
                                int i9 = 0;
                                while (true) {
                                    if (z5) {
                                        charCount11 = java.lang.Character.charCount(codePointAt) + i9 + 1 + charCount11;
                                        z5 = false;
                                    }
                                    if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                        break;
                                    }
                                    if (i8 < length) {
                                        int codePointAt3 = java.lang.Character.codePointAt(fVar, i8);
                                        int charCount13 = java.lang.Character.charCount(codePointAt3) + i8;
                                        if (codePointAt3 == 8419) {
                                            int codePointBefore10 = java.lang.Character.codePointBefore(fVar, charCount13);
                                            int charCount14 = java.lang.Character.charCount(codePointBefore10) + charCount13;
                                            if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                                int codePointAt4 = java.lang.Character.codePointAt(fVar, charCount14);
                                                if (Z0.h.p(codePointAt4)) {
                                                    charCount2 = java.lang.Character.charCount(codePointBefore10);
                                                    charCount3 = java.lang.Character.charCount(codePointAt4);
                                                }
                                            } else if (Z0.h.p(codePointBefore10)) {
                                                charCount = java.lang.Character.charCount(codePointBefore10);
                                            }
                                        } else {
                                            if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                                charCount4 = java.lang.Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                                charCount4 = java.lang.Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (codePointAt3 == 8205) {
                                                int codePointAt5 = java.lang.Character.codePointAt(fVar, charCount13);
                                                int charCount15 = java.lang.Character.charCount(codePointAt5) + charCount13;
                                                if (charCount15 >= length || !flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                    codePointAt = codePointAt5;
                                                    i8 = charCount15;
                                                    i9 = 0;
                                                } else {
                                                    int codePointAt6 = java.lang.Character.codePointAt(fVar, charCount15);
                                                    int charCount16 = java.lang.Character.charCount(codePointAt6);
                                                    int charCount17 = java.lang.Character.charCount(codePointAt6) + charCount15;
                                                    i9 = charCount16;
                                                    i8 = charCount17;
                                                    codePointAt = codePointAt6;
                                                }
                                                z5 = true;
                                                if (i8 < length || !z5 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt3;
                                                i8 = charCount13;
                                            }
                                        }
                                    }
                                    i9 = 0;
                                    if (i8 < length) {
                                        break;
                                    }
                                }
                                charCount11 += charCount4;
                            }
                        } else if (i8 >= i7 || !flutterJNI2.isCodePointRegionalIndicator(java.lang.Character.codePointAt(fVar, i8))) {
                            i4 = i8;
                        } else {
                            int i10 = selectionEnd;
                            while (i10 > 0 && flutterJNI2.isCodePointRegionalIndicator(java.lang.Character.codePointBefore(fVar, selectionEnd))) {
                                i10 -= java.lang.Character.charCount(java.lang.Character.codePointBefore(fVar, selectionEnd));
                                i4++;
                            }
                            if (i4 % 2 == 0) {
                                charCount11 += 2;
                            }
                        }
                    } else if (java.lang.Character.codePointAt(fVar, i8) == 13) {
                        charCount11++;
                    }
                    i4 = selectionEnd + charCount11;
                }
            }
            min = java.lang.Math.min(i4, fVar.length());
        }
        if (selectionStart != selectionEnd || z3) {
            setSelection(selectionStart, min);
        } else {
            setSelection(min, min);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        io.flutter.plugin.editing.f fVar = this.f7687d;
        fVar.getClass();
        if (android.text.Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i2, i3);
    }

    public final boolean e(boolean z2, boolean z3) {
        io.flutter.plugin.editing.f fVar = this.f7687d;
        int selectionStart = android.text.Selection.getSelectionStart(fVar);
        int selectionEnd = android.text.Selection.getSelectionEnd(fVar);
        boolean z4 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z3) {
            z4 = true;
        }
        beginBatchEdit();
        android.text.DynamicLayout dynamicLayout = this.f7694k;
        if (z4) {
            if (z2) {
                android.text.Selection.moveUp(fVar, dynamicLayout);
            } else {
                android.text.Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = android.text.Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                android.text.Selection.extendUp(fVar, dynamicLayout);
            } else {
                android.text.Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(android.text.Selection.getSelectionStart(fVar), android.text.Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f7697n--;
        this.f7687d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final android.text.Editable getEditable() {
        return this.f7687d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i2) {
        this.f7689f = (i2 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        beginBatchEdit();
        boolean z2 = true;
        io.flutter.plugin.editing.f fVar = this.f7687d;
        if (i2 == 16908319) {
            setSelection(0, fVar.length());
        } else {
            P0.t tVar = this.f7684a;
            if (i2 == 16908320) {
                int selectionStart = android.text.Selection.getSelectionStart(fVar);
                int selectionEnd = android.text.Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int min = java.lang.Math.min(selectionStart, selectionEnd);
                    int max = java.lang.Math.max(selectionStart, selectionEnd);
                    ((android.content.ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", fVar.subSequence(min, max)));
                    fVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i2 == 16908321) {
                int selectionStart2 = android.text.Selection.getSelectionStart(fVar);
                int selectionEnd2 = android.text.Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((android.content.ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", fVar.subSequence(java.lang.Math.min(selectionStart2, selectionEnd2), java.lang.Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i2 == 16908322) {
                android.content.ClipData primaryClip = ((android.content.ClipboardManager) tVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    java.lang.CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(tVar.getContext());
                    int max2 = java.lang.Math.max(0, android.text.Selection.getSelectionStart(fVar));
                    int max3 = java.lang.Math.max(0, android.text.Selection.getSelectionEnd(fVar));
                    int min2 = java.lang.Math.min(max2, max3);
                    int max4 = java.lang.Math.max(max2, max3);
                    if (min2 != max4) {
                        fVar.delete(min2, max4);
                    }
                    fVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z2 = false;
            }
        }
        endBatchEdit();
        return z2;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i3 = this.f7685b;
        x0.e eVar = this.f7686c;
        if (i2 == 0) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.unspecified"), null);
        } else if (i2 == 1) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.newline"), null);
        } else if (i2 == 2) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.go"), null);
        } else if (i2 == 3) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.search"), null);
        } else if (i2 == 4) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.send"), null);
        } else if (i2 == 5) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.next"), null);
        } else if (i2 != 7) {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.done"), null);
        } else {
            eVar.getClass();
            ((I0.b) eVar.f8409b).G("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        x0.e eVar = this.f7686c;
        eVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof java.lang.Byte) {
                    hashMap2.put(str2, java.lang.Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof java.lang.Character) {
                    hashMap2.put(str2, java.lang.Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof java.lang.CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof java.lang.CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof java.lang.Float) {
                    hashMap2.put(str2, java.lang.Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((I0.b) eVar.f8409b).G("TextInputClient.performPrivateCommand", java.util.Arrays.asList(java.lang.Integer.valueOf(this.f7685b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        if ((i2 & 1) != 0) {
            this.f7693j.updateCursorAnchorInfo(this.f7684a, b());
        }
        this.f7690g = (i2 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f7696m.E(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i2) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i2) : super.setComposingText(charSequence, i2);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        beginBatchEdit();
        boolean selection = super.setSelection(i2, i3);
        endBatchEdit();
        return selection;
    }
}
