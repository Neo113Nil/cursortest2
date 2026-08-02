package androidx.core.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aR\u0010\b\u001a\u00020\u0007*\u00020\u00002<\b\u0004\u0010\u0006\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001aR\u0010\n\u001a\u00020\u0007*\u00020\u00002<\b\u0004\u0010\u0006\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\t\u001a1\u0010\r\u001a\u00020\u0007*\u00020\u00002\u001b\b\u0004\u0010\u0006\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u00ad\u0001\u0010\u0012\u001a\u00020\u0007*\u00020\u00002<\b\u0006\u0010\u000f\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u00012<\b\u0006\u0010\u0010\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u001b\b\u0006\u0010\u0011\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "", "", "action", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function4;)Landroid/text/TextWatcher;", "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;", "beforeTextChanged", "onTextChanged", "afterTextChanged", "addTextChangedListener", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextViewKt {
    public static /* synthetic */ android.text.TextWatcher addTextChangedListener$default(android.widget.TextView textView, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function4 function42, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function4 = new kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$1
                public final void invoke(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function42 = new kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$2
                public final void invoke(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.text.Editable editable) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.text.Editable editable) {
                    invoke2(editable);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function42);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final android.text.TextWatcher addTextChangedListener(android.widget.TextView textView, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function42, kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> function1) {
        androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function42);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final android.text.TextWatcher doBeforeTextChanged(android.widget.TextView textView, final kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function4) {
        android.text.TextWatcher textWatcher = new android.text.TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(android.text.Editable s) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
                kotlin.jvm.functions.Function4.this.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(after));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final android.text.TextWatcher doOnTextChanged(android.widget.TextView textView, final kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function4) {
        android.text.TextWatcher textWatcher = new android.text.TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(android.text.Editable s) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
                kotlin.jvm.functions.Function4.this.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(before), java.lang.Integer.valueOf(count));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final android.text.TextWatcher doAfterTextChanged(android.widget.TextView textView, final kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> function1) {
        android.text.TextWatcher textWatcher = new android.text.TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(android.text.Editable s) {
                kotlin.jvm.functions.Function1.this.invoke(s);
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
