package androidx.compose.ui.focus;

/* compiled from: FocusProperties.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eRB\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRB\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR$\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR$\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/focus/FocusRequester;", "down", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", "left", "getLeft", "setLeft", io.ktor.http.LinkHeader.Rel.Next, "getNext", "setNext", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FocusProperties {
    boolean getCanFocus();

    androidx.compose.ui.focus.FocusRequester getDown();

    androidx.compose.ui.focus.FocusRequester getEnd();

    kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester> getEnter();

    kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester> getExit();

    androidx.compose.ui.focus.FocusRequester getLeft();

    androidx.compose.ui.focus.FocusRequester getNext();

    androidx.compose.ui.focus.FocusRequester getPrevious();

    androidx.compose.ui.focus.FocusRequester getRight();

    androidx.compose.ui.focus.FocusRequester getStart();

    androidx.compose.ui.focus.FocusRequester getUp();

    void setCanFocus(boolean z);

    void setDown(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setEnd(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setEnter(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester> function1);

    void setExit(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester> function1);

    void setLeft(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setNext(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setPrevious(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setRight(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setStart(androidx.compose.ui.focus.FocusRequester focusRequester);

    void setUp(androidx.compose.ui.focus.FocusRequester focusRequester);

    /* compiled from: FocusProperties.kt */
    /* renamed from: androidx.compose.ui.focus.FocusProperties$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setDown(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setEnd(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setEnter(androidx.compose.ui.focus.FocusProperties _this, kotlin.jvm.functions.Function1 function1) {
        }

        public static void $default$setExit(androidx.compose.ui.focus.FocusProperties _this, kotlin.jvm.functions.Function1 function1) {
        }

        public static void $default$setLeft(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setNext(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setPrevious(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setRight(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setStart(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static void $default$setUp(androidx.compose.ui.focus.FocusProperties _this, androidx.compose.ui.focus.FocusRequester focusRequester) {
        }

        public static /* synthetic */ void getEnter$annotations() {
        }

        public static /* synthetic */ void getExit$annotations() {
        }
    }
}
