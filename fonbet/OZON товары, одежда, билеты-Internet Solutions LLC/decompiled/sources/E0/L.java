package E0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class L {
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull EditorInfo editorInfo, @NotNull CharSequence charSequence, long j11, @NotNull Q1.r rVar, String[] strArr) {
        int i11;
        int f7;
        int i12;
        int e11 = rVar.e();
        if (e11 != 1) {
            if (e11 == 0) {
                i11 = 1;
            } else if (e11 == 2) {
                i11 = 2;
            } else if (e11 == 6) {
                i11 = 5;
            } else if (e11 == 5) {
                i11 = 7;
            } else if (e11 == 3) {
                i11 = 3;
            } else if (e11 == 4) {
                i11 = 4;
            } else {
                if (e11 != 7) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i11 = 6;
            }
            editorInfo.imeOptions = i11;
            C2937n0.f7278a.a(editorInfo, rVar.d());
            f7 = rVar.f();
            if (f7 != 1) {
            }
            i12 = 1;
            editorInfo.inputType = i12;
            if (!rVar.g()) {
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            int i13 = K1.Q.f15010c;
            editorInfo.initialSelStart = (int) (j11 >> 32);
            editorInfo.initialSelEnd = (int) (j11 & 4294967295L);
            B2.a.b(editorInfo, charSequence);
            if (strArr != null) {
            }
            editorInfo.imeOptions |= 33554432;
            if (C0.c.a()) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        }
        if (!rVar.g()) {
            i11 = 0;
            editorInfo.imeOptions = i11;
            C2937n0.f7278a.a(editorInfo, rVar.d());
            f7 = rVar.f();
            if (f7 != 1) {
                if (f7 != 2) {
                    if (f7 == 3) {
                        i12 = 2;
                    } else if (f7 == 4) {
                        i12 = 3;
                    } else if (f7 == 5) {
                        i12 = 17;
                    } else if (f7 == 6) {
                        i12 = 33;
                    } else if (f7 == 7) {
                        i12 = 129;
                    } else if (f7 == 8) {
                        i12 = 18;
                    } else {
                        if (f7 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        i12 = 8194;
                    }
                    editorInfo.inputType = i12;
                    if (!rVar.g()) {
                        int i14 = editorInfo.inputType;
                        if ((i14 & 1) == 1) {
                            editorInfo.inputType = i14 | 131072;
                            if (rVar.e() == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    if ((editorInfo.inputType & 1) == 1) {
                        int c11 = rVar.c();
                        if (c11 == 1) {
                            editorInfo.inputType |= 4096;
                        } else if (c11 == 2) {
                            editorInfo.inputType |= 8192;
                        } else if (c11 == 3) {
                            editorInfo.inputType |= 16384;
                        }
                        if (rVar.b()) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i132 = K1.Q.f15010c;
                    editorInfo.initialSelStart = (int) (j11 >> 32);
                    editorInfo.initialSelEnd = (int) (j11 & 4294967295L);
                    B2.a.b(editorInfo, charSequence);
                    if (strArr != null) {
                        editorInfo.contentMimeTypes = strArr;
                    }
                    editorInfo.imeOptions |= 33554432;
                    if (C0.c.a() || rVar.f() == 7 || rVar.f() == 8) {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                    } else {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                        K.f7045a.a(editorInfo);
                        return;
                    }
                }
                editorInfo.imeOptions |= LinearLayoutManager.INVALID_OFFSET;
            }
            i12 = 1;
            editorInfo.inputType = i12;
            if (!rVar.g()) {
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            int i1322 = K1.Q.f15010c;
            editorInfo.initialSelStart = (int) (j11 >> 32);
            editorInfo.initialSelEnd = (int) (j11 & 4294967295L);
            B2.a.b(editorInfo, charSequence);
            if (strArr != null) {
            }
            editorInfo.imeOptions |= 33554432;
            if (C0.c.a()) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        }
        i11 = 6;
        editorInfo.imeOptions = i11;
        C2937n0.f7278a.a(editorInfo, rVar.d());
        f7 = rVar.f();
        if (f7 != 1) {
        }
        i12 = 1;
        editorInfo.inputType = i12;
        if (!rVar.g()) {
        }
        if ((editorInfo.inputType & 1) == 1) {
        }
        int i13222 = K1.Q.f15010c;
        editorInfo.initialSelStart = (int) (j11 >> 32);
        editorInfo.initialSelEnd = (int) (j11 & 4294967295L);
        B2.a.b(editorInfo, charSequence);
        if (strArr != null) {
        }
        editorInfo.imeOptions |= 33554432;
        if (C0.c.a()) {
        }
        if (editorInfo.extras == null) {
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
    }
}
