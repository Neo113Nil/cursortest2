package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028g@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028g@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u00020\u000b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u00108'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "", "", "getMinute", "()I", "setMinute", "(I)V", "minute", "getHour", "setHour", "hour", "", "is24hour", "()Z", "set24hour", "(Z)V", "Landroidx/compose/material3/TimePickerSelectionMode;", "getSelection-yecRtBI", "setSelection-6_8s6DQ", "selection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TimePickerState {
    int getHour();

    int getMinute();

    /* renamed from: getSelection-yecRtBI */
    int mo2876getSelectionyecRtBI();

    boolean is24hour();

    void set24hour(boolean z);

    void setHour(int i);

    void setMinute(int i);

    /* renamed from: setSelection-6_8s6DQ */
    void mo2878setSelection6_8s6DQ(int i);
}
