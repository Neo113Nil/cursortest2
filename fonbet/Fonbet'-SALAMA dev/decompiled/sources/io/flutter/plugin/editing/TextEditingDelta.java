package io.flutter.plugin.editing;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class TextEditingDelta {
    private static final String TAG = "TextEditingDelta";
    private int deltaEnd;
    private int deltaStart;
    private CharSequence deltaText;
    private int newComposingEnd;
    private int newComposingStart;
    private int newSelectionEnd;
    private int newSelectionStart;
    private CharSequence oldText;

    public TextEditingDelta(CharSequence charSequence, int i7, int i8, CharSequence charSequence2, int i9, int i10, int i11, int i12) {
        this.newSelectionStart = i9;
        this.newSelectionEnd = i10;
        this.newComposingStart = i11;
        this.newComposingEnd = i12;
        setDeltas(charSequence, charSequence2.toString(), i7, i8);
    }

    private void setDeltas(CharSequence charSequence, CharSequence charSequence2, int i7, int i8) {
        this.oldText = charSequence;
        this.deltaText = charSequence2;
        this.deltaStart = i7;
        this.deltaEnd = i8;
    }

    public int getDeltaEnd() {
        return this.deltaEnd;
    }

    public int getDeltaStart() {
        return this.deltaStart;
    }

    public CharSequence getDeltaText() {
        return this.deltaText;
    }

    public int getNewComposingEnd() {
        return this.newComposingEnd;
    }

    public int getNewComposingStart() {
        return this.newComposingStart;
    }

    public int getNewSelectionEnd() {
        return this.newSelectionEnd;
    }

    public int getNewSelectionStart() {
        return this.newSelectionStart;
    }

    public CharSequence getOldText() {
        return this.oldText;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.oldText.toString());
            jSONObject.put("deltaText", this.deltaText.toString());
            jSONObject.put("deltaStart", this.deltaStart);
            jSONObject.put("deltaEnd", this.deltaEnd);
            jSONObject.put("selectionBase", this.newSelectionStart);
            jSONObject.put("selectionExtent", this.newSelectionEnd);
            jSONObject.put("composingBase", this.newComposingStart);
            jSONObject.put("composingExtent", this.newComposingEnd);
        } catch (JSONException e7) {
            Log.e(TAG, "unable to create JSONObject: " + e7);
        }
        return jSONObject;
    }

    public TextEditingDelta(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        this.newSelectionStart = i7;
        this.newSelectionEnd = i8;
        this.newComposingStart = i9;
        this.newComposingEnd = i10;
        setDeltas(charSequence, "", -1, -1);
    }
}
