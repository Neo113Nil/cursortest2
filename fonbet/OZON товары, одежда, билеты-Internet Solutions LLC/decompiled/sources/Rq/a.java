package Rq;

import android.view.KeyEvent;
import android.widget.TextView;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean lambda$3$lambda$2;
        lambda$3$lambda$2 = TextInputFilterViewHolder.lambda$3$lambda$2(textView, i11, keyEvent);
        return lambda$3$lambda$2;
    }
}
