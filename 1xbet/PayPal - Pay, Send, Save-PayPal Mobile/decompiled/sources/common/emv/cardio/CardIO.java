package common.emv.cardio;

/* loaded from: classes17.dex */
public interface CardIO {
    boolean disable();

    boolean enable(common.emv.cardio.CardIOSessionListener cardIOSessionListener) throws common.emv.cardio.CardIONotReadyException;

    boolean isEnabled();

    boolean isReady();
}
