package com.paypal.android.threeds.interfaces;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "", "Lcom/paypal/android/threeds/data/model/CompletionEvent;", "completionEvent", "", "onCompleted", "(Lcom/paypal/android/threeds/data/model/CompletionEvent;)V", "onCancelled", "()V", "timedOut", "Lcom/paypal/android/threeds/data/model/ProtocolErrorEvent;", "protocolErrorEvent", "protocolError", "(Lcom/paypal/android/threeds/data/model/ProtocolErrorEvent;)V", "Lcom/paypal/android/threeds/data/model/RuntimeErrorEvent;", "runtimeErrorEvent", "runtimeError", "(Lcom/paypal/android/threeds/data/model/RuntimeErrorEvent;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ChallengeStatusReceiver {
    void onCancelled();

    void onCompleted(com.paypal.android.threeds.data.model.CompletionEvent completionEvent);

    void protocolError(com.paypal.android.threeds.data.model.ProtocolErrorEvent protocolErrorEvent);

    void runtimeError(com.paypal.android.threeds.data.model.RuntimeErrorEvent runtimeErrorEvent);

    void timedOut();
}
