package io.flutter.plugin.editing;

import I1.q;
import T1.o;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends BaseInputConnection implements g {

    /* renamed from: a, reason: collision with root package name */
    public final q f9180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9181b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.e f9182c;

    /* renamed from: d, reason: collision with root package name */
    public final h f9183d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f9184e;
    public ExtractedTextRequest f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9185g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f9186h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f9187i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f9188j;

    /* renamed from: k, reason: collision with root package name */
    public final DynamicLayout f9189k;

    /* renamed from: l, reason: collision with root package name */
    public final b0.j f9190l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.j f9191m;

    /* renamed from: n, reason: collision with root package name */
    public int f9192n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, int i3, a1.e eVar, A0.j jVar, h hVar, EditorInfo editorInfo) {
        super(qVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f9185g = false;
        this.f9187i = new ExtractedText();
        this.f9192n = 0;
        this.f9180a = qVar;
        this.f9181b = i3;
        this.f9182c = eVar;
        this.f9183d = hVar;
        hVar.a(this);
        this.f9184e = editorInfo;
        this.f9191m = jVar;
        this.f9190l = new b0.j(flutterJNI);
        this.f9189k = new DynamicLayout(hVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f9188j = (InputMethodManager) qVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.g
    public final void a(boolean z3) {
        h hVar = this.f9183d;
        hVar.getClass();
        this.f9188j.updateSelection(this.f9180a, Selection.getSelectionStart(hVar), Selection.getSelectionEnd(hVar), BaseInputConnection.getComposingSpanStart(hVar), BaseInputConnection.getComposingSpanEnd(hVar));
        ExtractedTextRequest extractedTextRequest = this.f;
        InputMethodManager inputMethodManager = this.f9188j;
        q qVar = this.f9180a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(qVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f9185g) {
            inputMethodManager.updateCursorAnchorInfo(qVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f9186h;
        if (builder == null) {
            this.f9186h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f9186h;
        h hVar = this.f9183d;
        hVar.getClass();
        int selectionStart = Selection.getSelectionStart(hVar);
        hVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(hVar));
        hVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(hVar);
        hVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(hVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f9186h.setComposingText(-1, "");
        } else {
            this.f9186h.setComposingText(composingSpanStart, hVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f9186h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f9183d.b();
        this.f9192n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f9187i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f9183d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f9183d.e(this);
        while (this.f9192n > 0) {
            endBatchEdit();
            this.f9192n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        int i4;
        if ((i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f9180a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i4 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i4 = -1;
                                    }
                                    if (i4 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        a1.e eVar = this.f9182c;
                                        eVar.getClass();
                                        ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f9181b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    public final boolean d(boolean z3, boolean z4) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i3;
        int i4;
        int charCount7;
        h hVar = this.f9183d;
        int selectionStart = Selection.getSelectionStart(hVar);
        int selectionEnd = Selection.getSelectionEnd(hVar);
        int i5 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        b0.j jVar = this.f9190l;
        if (z3) {
            jVar.getClass();
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(hVar, selectionEnd))))) != 0) {
                if (codePointBefore != 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) jVar.f2462a;
                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                        int codePointBefore2 = Character.codePointBefore(hVar, charCount6);
                        int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                        int i6 = 1;
                        while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                            codePointBefore2 = Character.codePointBefore(hVar, charCount8);
                            charCount8 -= Character.charCount(codePointBefore2);
                            i6++;
                        }
                        if (i6 % 2 == 0) {
                            charCount5 += 2;
                        }
                    } else if (codePointBefore == 8419) {
                        int codePointBefore3 = Character.codePointBefore(hVar, charCount6);
                        int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                        if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                            int codePointBefore4 = Character.codePointBefore(hVar, charCount9);
                            if (b0.j.e(codePointBefore4)) {
                                charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                                charCount5 += charCount7;
                            }
                        } else if (b0.j.e(codePointBefore3)) {
                            charCount7 = Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else {
                        if (codePointBefore == 917631) {
                            int codePointBefore5 = Character.codePointBefore(hVar, charCount6);
                            charCount6 -= Character.charCount(codePointBefore5);
                            codePointBefore = codePointBefore5;
                            while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                                charCount5 += Character.charCount(codePointBefore);
                                codePointBefore = Character.codePointBefore(hVar, charCount6);
                                charCount6 -= Character.charCount(codePointBefore);
                            }
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += Character.charCount(codePointBefore);
                            } else {
                                i4 = selectionEnd - 2;
                            }
                        }
                        if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                            codePointBefore = Character.codePointBefore(hVar, charCount6);
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += Character.charCount(codePointBefore);
                                charCount6 -= charCount5;
                            }
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            boolean z5 = false;
                            int i7 = 0;
                            while (true) {
                                if (z5) {
                                    charCount5 = Character.charCount(codePointBefore) + i7 + 1 + charCount5;
                                    z5 = false;
                                }
                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                    int codePointBefore6 = Character.codePointBefore(hVar, charCount6);
                                    int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                    if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                        i3 = 0;
                                    } else {
                                        codePointBefore6 = Character.codePointBefore(hVar, charCount10);
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            i3 = Character.charCount(codePointBefore6);
                                            Character.charCount(codePointBefore6);
                                        }
                                    }
                                    if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                        charCount5 += Character.charCount(codePointBefore6) + i3;
                                    }
                                } else {
                                    if (charCount6 > 0) {
                                        int codePointBefore7 = Character.codePointBefore(hVar, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore7);
                                        if (codePointBefore7 == 8205) {
                                            int codePointBefore8 = Character.codePointBefore(hVar, charCount6);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                            if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                                i7 = 0;
                                            } else {
                                                codePointBefore8 = Character.codePointBefore(hVar, charCount6);
                                                i7 = Character.charCount(codePointBefore8);
                                                charCount6 -= Character.charCount(codePointBefore8);
                                            }
                                            codePointBefore = codePointBefore8;
                                            z5 = true;
                                            if (charCount6 != 0 || !z5 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            codePointBefore = codePointBefore7;
                                        }
                                    }
                                    i7 = 0;
                                    if (charCount6 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (Character.codePointBefore(hVar, charCount6) == 13) {
                    charCount5++;
                }
                i4 = selectionEnd - charCount5;
            } else {
                i4 = 0;
            }
            min = Math.max(i4, 0);
        } else {
            jVar.getClass();
            int length = hVar.length();
            int i8 = length - 1;
            if (selectionEnd >= i8) {
                i5 = length;
            } else {
                int codePointAt = Character.codePointAt(hVar, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i9 = selectionEnd + charCount11;
                if (i9 != 0) {
                    if (codePointAt != 10) {
                        FlutterJNI flutterJNI2 = (FlutterJNI) jVar.f2462a;
                        if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                            if (b0.j.e(codePointAt)) {
                                charCount11 += Character.charCount(codePointAt);
                            }
                            if (codePointAt == 8419) {
                                int codePointBefore9 = Character.codePointBefore(hVar, i9);
                                int charCount12 = Character.charCount(codePointBefore9) + i9;
                                if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                    int codePointAt2 = Character.codePointAt(hVar, charCount12);
                                    if (b0.j.e(codePointAt2)) {
                                        charCount2 = Character.charCount(codePointBefore9);
                                        charCount3 = Character.charCount(codePointAt2);
                                        charCount11 += charCount3 + charCount2;
                                    }
                                } else if (b0.j.e(codePointBefore9)) {
                                    charCount = Character.charCount(codePointBefore9);
                                    charCount11 += charCount;
                                }
                            } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                                boolean z6 = false;
                                int i10 = 0;
                                while (true) {
                                    if (z6) {
                                        charCount11 = Character.charCount(codePointAt) + i10 + 1 + charCount11;
                                        z6 = false;
                                    }
                                    if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                        break;
                                    }
                                    if (i9 < length) {
                                        int codePointAt3 = Character.codePointAt(hVar, i9);
                                        int charCount13 = Character.charCount(codePointAt3) + i9;
                                        if (codePointAt3 == 8419) {
                                            int codePointBefore10 = Character.codePointBefore(hVar, charCount13);
                                            int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                            if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                                int codePointAt4 = Character.codePointAt(hVar, charCount14);
                                                if (b0.j.e(codePointAt4)) {
                                                    charCount2 = Character.charCount(codePointBefore10);
                                                    charCount3 = Character.charCount(codePointAt4);
                                                }
                                            } else if (b0.j.e(codePointBefore10)) {
                                                charCount = Character.charCount(codePointBefore10);
                                            }
                                        } else {
                                            if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                                charCount4 = Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                                charCount4 = Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (codePointAt3 == 8205) {
                                                int codePointAt5 = Character.codePointAt(hVar, charCount13);
                                                int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                                if (charCount15 >= length || !flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                    codePointAt = codePointAt5;
                                                    i9 = charCount15;
                                                    i10 = 0;
                                                } else {
                                                    int codePointAt6 = Character.codePointAt(hVar, charCount15);
                                                    int charCount16 = Character.charCount(codePointAt6);
                                                    int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                    i10 = charCount16;
                                                    i9 = charCount17;
                                                    codePointAt = codePointAt6;
                                                }
                                                z6 = true;
                                                if (i9 < length || !z6 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt3;
                                                i9 = charCount13;
                                            }
                                        }
                                    }
                                    i10 = 0;
                                    if (i9 < length) {
                                        break;
                                    }
                                }
                                charCount11 += charCount4;
                            }
                        } else if (i9 >= i8 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(hVar, i9))) {
                            i5 = i9;
                        } else {
                            int i11 = selectionEnd;
                            while (i11 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(hVar, selectionEnd))) {
                                i11 -= Character.charCount(Character.codePointBefore(hVar, selectionEnd));
                                i5++;
                            }
                            if (i5 % 2 == 0) {
                                charCount11 += 2;
                            }
                        }
                    } else if (Character.codePointAt(hVar, i9) == 13) {
                        charCount11++;
                    }
                    i5 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i5, hVar.length());
        }
        if (selectionStart != selectionEnd || z4) {
            setSelection(selectionStart, min);
            return true;
        }
        setSelection(min, min);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        h hVar = this.f9183d;
        hVar.getClass();
        if (Selection.getSelectionStart(hVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    public final boolean e(boolean z3, boolean z4) {
        h hVar = this.f9183d;
        int selectionStart = Selection.getSelectionStart(hVar);
        int selectionEnd = Selection.getSelectionEnd(hVar);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f9189k;
        if (z5) {
            if (z3) {
                Selection.moveUp(hVar, dynamicLayout);
            } else {
                Selection.moveDown(hVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(hVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(hVar, dynamicLayout);
            } else {
                Selection.extendDown(hVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(hVar), Selection.getSelectionEnd(hVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f9192n--;
        this.f9183d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f9183d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        this.f = (i3 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean z3 = true;
        h hVar = this.f9183d;
        if (i3 == 16908319) {
            setSelection(0, hVar.length());
        } else {
            q qVar = this.f9180a;
            if (i3 == 16908320) {
                int selectionStart = Selection.getSelectionStart(hVar);
                int selectionEnd = Selection.getSelectionEnd(hVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) qVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", hVar.subSequence(min, max)));
                    hVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i3 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(hVar);
                int selectionEnd2 = Selection.getSelectionEnd(hVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) qVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", hVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i3 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) qVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(qVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(hVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(hVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        hVar.delete(min2, max4);
                    }
                    hVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z3 = false;
            }
        }
        endBatchEdit();
        return z3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        int i4 = this.f9181b;
        a1.e eVar = this.f9182c;
        if (i3 == 0) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i3 == 1) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.newline"), null);
            return true;
        }
        if (i3 == 2) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.go"), null);
            return true;
        }
        if (i3 == 3) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.search"), null);
            return true;
        }
        if (i3 == 4) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.send"), null);
            return true;
        }
        if (i3 == 5) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.next"), null);
            return true;
        }
        if (i3 != 7) {
            eVar.getClass();
            ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.done"), null);
            return true;
        }
        eVar.getClass();
        ((o) eVar.f1788b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        a1.e eVar = this.f9182c;
        eVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((o) eVar.f1788b).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f9181b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.f9188j.updateCursorAnchorInfo(this.f9180a, b());
        }
        this.f9185g = (i3 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f9191m.E(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }
}
