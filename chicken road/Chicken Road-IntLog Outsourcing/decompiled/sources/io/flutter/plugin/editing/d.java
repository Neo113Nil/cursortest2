package io.flutter.plugin.editing;

import H2.o;
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
import w2.m;

/* loaded from: classes.dex */
public final class d extends BaseInputConnection implements f {

    /* renamed from: a, reason: collision with root package name */
    public final m f10154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10155b;

    /* renamed from: c, reason: collision with root package name */
    public final x1.e f10156c;

    /* renamed from: d, reason: collision with root package name */
    public final g f10157d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f10158e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f10159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10160g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f10161h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f10162i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f10163j;

    /* renamed from: k, reason: collision with root package name */
    public final DynamicLayout f10164k;

    /* renamed from: l, reason: collision with root package name */
    public final V0.j f10165l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.c f10166m;

    /* renamed from: n, reason: collision with root package name */
    public int f10167n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, int i2, x1.e eVar, x0.c cVar, g gVar, EditorInfo editorInfo) {
        super(mVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f10160g = false;
        this.f10162i = new ExtractedText();
        this.f10167n = 0;
        this.f10154a = mVar;
        this.f10155b = i2;
        this.f10156c = eVar;
        this.f10157d = gVar;
        gVar.a(this);
        this.f10158e = editorInfo;
        this.f10166m = cVar;
        this.f10165l = new V0.j(12, flutterJNI);
        this.f10164k = new DynamicLayout(gVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10163j = (InputMethodManager) mVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.f
    public final void a(boolean z) {
        g gVar = this.f10157d;
        gVar.getClass();
        this.f10163j.updateSelection(this.f10154a, Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar), BaseInputConnection.getComposingSpanStart(gVar), BaseInputConnection.getComposingSpanEnd(gVar));
        ExtractedTextRequest extractedTextRequest = this.f10159f;
        InputMethodManager inputMethodManager = this.f10163j;
        m mVar = this.f10154a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(mVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f10160g) {
            inputMethodManager.updateCursorAnchorInfo(mVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f10161h;
        if (builder == null) {
            this.f10161h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f10161h;
        g gVar = this.f10157d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        gVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(gVar));
        gVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        gVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f10161h.setComposingText(-1, "");
        } else {
            this.f10161h.setComposingText(composingSpanStart, gVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f10161h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f10157d.b();
        this.f10167n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f10162i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f10157d;
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
        this.f10157d.e(this);
        while (this.f10167n > 0) {
            endBatchEdit();
            this.f10167n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        int i3;
        if ((i2 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f10154a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i3 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i3 = -1;
                                    }
                                    if (i3 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        x1.e eVar = this.f10156c;
                                        eVar.getClass();
                                        ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f10155b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i3);
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

    public final boolean d(boolean z, boolean z5) {
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
        g gVar = this.f10157d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        int i6 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        V0.j jVar = this.f10165l;
        if (z) {
            jVar.getClass();
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(gVar, selectionEnd))))) != 0) {
                if (codePointBefore != 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) jVar.f3212b;
                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                        int codePointBefore2 = Character.codePointBefore(gVar, charCount6);
                        int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                        int i7 = 1;
                        while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                            codePointBefore2 = Character.codePointBefore(gVar, charCount8);
                            charCount8 -= Character.charCount(codePointBefore2);
                            i7++;
                        }
                        if (i7 % 2 == 0) {
                            charCount5 += 2;
                        }
                    } else if (codePointBefore == 8419) {
                        int codePointBefore3 = Character.codePointBefore(gVar, charCount6);
                        int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                        if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                            int codePointBefore4 = Character.codePointBefore(gVar, charCount9);
                            if (V0.j.K(codePointBefore4)) {
                                charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                                charCount5 += charCount7;
                            }
                        } else if (V0.j.K(codePointBefore3)) {
                            charCount7 = Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else {
                        if (codePointBefore == 917631) {
                            int codePointBefore5 = Character.codePointBefore(gVar, charCount6);
                            charCount6 -= Character.charCount(codePointBefore5);
                            codePointBefore = codePointBefore5;
                            while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                                charCount5 += Character.charCount(codePointBefore);
                                codePointBefore = Character.codePointBefore(gVar, charCount6);
                                charCount6 -= Character.charCount(codePointBefore);
                            }
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += Character.charCount(codePointBefore);
                            } else {
                                i3 = selectionEnd - 2;
                            }
                        }
                        if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                            codePointBefore = Character.codePointBefore(gVar, charCount6);
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += Character.charCount(codePointBefore);
                                charCount6 -= charCount5;
                            }
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            boolean z6 = false;
                            int i8 = 0;
                            while (true) {
                                if (z6) {
                                    charCount5 = Character.charCount(codePointBefore) + i8 + 1 + charCount5;
                                    z6 = false;
                                }
                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                    int codePointBefore6 = Character.codePointBefore(gVar, charCount6);
                                    int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                    if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                        i2 = 0;
                                    } else {
                                        codePointBefore6 = Character.codePointBefore(gVar, charCount10);
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            i2 = Character.charCount(codePointBefore6);
                                            Character.charCount(codePointBefore6);
                                        }
                                    }
                                    if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                        charCount5 += Character.charCount(codePointBefore6) + i2;
                                    }
                                } else {
                                    if (charCount6 > 0) {
                                        int codePointBefore7 = Character.codePointBefore(gVar, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore7);
                                        if (codePointBefore7 == 8205) {
                                            int codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                            if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                                i8 = 0;
                                            } else {
                                                codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                                i8 = Character.charCount(codePointBefore8);
                                                charCount6 -= Character.charCount(codePointBefore8);
                                            }
                                            codePointBefore = codePointBefore8;
                                            z6 = true;
                                            if (charCount6 != 0 || !z6 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            codePointBefore = codePointBefore7;
                                        }
                                    }
                                    i8 = 0;
                                    if (charCount6 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (Character.codePointBefore(gVar, charCount6) == 13) {
                    charCount5++;
                }
                i3 = selectionEnd - charCount5;
            } else {
                i3 = 0;
            }
            min = Math.max(i3, 0);
        } else {
            jVar.getClass();
            int length = gVar.length();
            int i9 = length - 1;
            if (selectionEnd >= i9) {
                i6 = length;
            } else {
                int codePointAt = Character.codePointAt(gVar, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i10 = selectionEnd + charCount11;
                if (i10 != 0) {
                    if (codePointAt != 10) {
                        FlutterJNI flutterJNI2 = (FlutterJNI) jVar.f3212b;
                        if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                            if (V0.j.K(codePointAt)) {
                                charCount11 += Character.charCount(codePointAt);
                            }
                            if (codePointAt == 8419) {
                                int codePointBefore9 = Character.codePointBefore(gVar, i10);
                                int charCount12 = Character.charCount(codePointBefore9) + i10;
                                if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                    int codePointAt2 = Character.codePointAt(gVar, charCount12);
                                    if (V0.j.K(codePointAt2)) {
                                        charCount2 = Character.charCount(codePointBefore9);
                                        charCount3 = Character.charCount(codePointAt2);
                                        charCount11 += charCount3 + charCount2;
                                    }
                                } else if (V0.j.K(codePointBefore9)) {
                                    charCount = Character.charCount(codePointBefore9);
                                    charCount11 += charCount;
                                }
                            } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                                boolean z7 = false;
                                int i11 = 0;
                                while (true) {
                                    if (z7) {
                                        charCount11 = Character.charCount(codePointAt) + i11 + 1 + charCount11;
                                        z7 = false;
                                    }
                                    if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                        break;
                                    }
                                    if (i10 < length) {
                                        int codePointAt3 = Character.codePointAt(gVar, i10);
                                        int charCount13 = Character.charCount(codePointAt3) + i10;
                                        if (codePointAt3 == 8419) {
                                            int codePointBefore10 = Character.codePointBefore(gVar, charCount13);
                                            int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                            if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                                int codePointAt4 = Character.codePointAt(gVar, charCount14);
                                                if (V0.j.K(codePointAt4)) {
                                                    charCount2 = Character.charCount(codePointBefore10);
                                                    charCount3 = Character.charCount(codePointAt4);
                                                }
                                            } else if (V0.j.K(codePointBefore10)) {
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
                                                int codePointAt5 = Character.codePointAt(gVar, charCount13);
                                                int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                                if (charCount15 >= length || !flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                    codePointAt = codePointAt5;
                                                    i10 = charCount15;
                                                    i11 = 0;
                                                } else {
                                                    int codePointAt6 = Character.codePointAt(gVar, charCount15);
                                                    int charCount16 = Character.charCount(codePointAt6);
                                                    int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                    i11 = charCount16;
                                                    i10 = charCount17;
                                                    codePointAt = codePointAt6;
                                                }
                                                z7 = true;
                                                if (i10 < length || !z7 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt3;
                                                i10 = charCount13;
                                            }
                                        }
                                    }
                                    i11 = 0;
                                    if (i10 < length) {
                                        break;
                                    }
                                }
                                charCount11 += charCount4;
                            }
                        } else if (i10 >= i9 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(gVar, i10))) {
                            i6 = i10;
                        } else {
                            int i12 = selectionEnd;
                            while (i12 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(gVar, selectionEnd))) {
                                i12 -= Character.charCount(Character.codePointBefore(gVar, selectionEnd));
                                i6++;
                            }
                            if (i6 % 2 == 0) {
                                charCount11 += 2;
                            }
                        }
                    } else if (Character.codePointAt(gVar, i10) == 13) {
                        charCount11++;
                    }
                    i6 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i6, gVar.length());
        }
        if (selectionStart != selectionEnd || z5) {
            setSelection(selectionStart, min);
        } else {
            setSelection(min, min);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        g gVar = this.f10157d;
        gVar.getClass();
        if (Selection.getSelectionStart(gVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i2, i3);
    }

    public final boolean e(boolean z, boolean z5) {
        g gVar = this.f10157d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f10164k;
        if (z6) {
            if (z) {
                Selection.moveUp(gVar, dynamicLayout);
            } else {
                Selection.moveDown(gVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(gVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(gVar, dynamicLayout);
            } else {
                Selection.extendDown(gVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f10167n--;
        this.f10157d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f10157d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        this.f10159f = (i2 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        beginBatchEdit();
        boolean z = true;
        g gVar = this.f10157d;
        if (i2 == 16908319) {
            setSelection(0, gVar.length());
        } else {
            m mVar = this.f10154a;
            if (i2 == 16908320) {
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) mVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(min, max)));
                    gVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i2 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(gVar);
                int selectionEnd2 = Selection.getSelectionEnd(gVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) mVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i2 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) mVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(mVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(gVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(gVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        gVar.delete(min2, max4);
                    }
                    gVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z = false;
            }
        }
        endBatchEdit();
        return z;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i3 = this.f10155b;
        x1.e eVar = this.f10156c;
        if (i2 == 0) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.unspecified"), null);
        } else if (i2 == 1) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.newline"), null);
        } else if (i2 == 2) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.go"), null);
        } else if (i2 == 3) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.search"), null);
        } else if (i2 == 4) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.send"), null);
        } else if (i2 == 5) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.next"), null);
        } else if (i2 != 7) {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.done"), null);
        } else {
            eVar.getClass();
            ((o) eVar.f12265a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        x1.e eVar = this.f10156c;
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
        ((o) eVar.f12265a).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f10155b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        if ((i2 & 1) != 0) {
            this.f10163j.updateCursorAnchorInfo(this.f10154a, b());
        }
        this.f10160g = (i2 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f10166m.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
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
