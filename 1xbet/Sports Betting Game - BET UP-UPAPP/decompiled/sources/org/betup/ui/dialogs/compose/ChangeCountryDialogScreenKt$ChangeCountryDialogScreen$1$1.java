package org.betup.ui.dialogs.compose;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.country.GetV7CountriesInteractor;
import org.betup.model.remote.entity.country.CountryModel;
import org.betup.model.remote.entity.country.CountryResponseModel;
import org.betup.services.user.UserService;

/* compiled from: ChangeCountryDialogScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1", f = "ChangeCountryDialogScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<List<CountryModel>> $countries$delegate;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ GetV7CountriesInteractor $getCountriesInteractor;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<CountryModel> $selectedCountry$delegate;
    final /* synthetic */ UserService $userService;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1(GetV7CountriesInteractor getV7CountriesInteractor, UserService userService, Context context, MutableState<List<CountryModel>> mutableState, MutableState<CountryModel> mutableState2, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, Continuation<? super ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1> continuation) {
        super(2, continuation);
        this.$getCountriesInteractor = getV7CountriesInteractor;
        this.$userService = userService;
        this.$context = context;
        this.$countries$delegate = mutableState;
        this.$selectedCountry$delegate = mutableState2;
        this.$isLoading$delegate = mutableState3;
        this.$errorMessage$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1(this.$getCountriesInteractor, this.$userService, this.$context, this.$countries$delegate, this.$selectedCountry$delegate, this.$isLoading$delegate, this.$errorMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GetV7CountriesInteractor getV7CountriesInteractor = this.$getCountriesInteractor;
        final UserService userService = this.$userService;
        final Context context = this.$context;
        final MutableState<List<CountryModel>> mutableState = this.$countries$delegate;
        final MutableState<CountryModel> mutableState2 = this.$selectedCountry$delegate;
        final MutableState<Boolean> mutableState3 = this.$isLoading$delegate;
        final MutableState<String> mutableState4 = this.$errorMessage$delegate;
        getV7CountriesInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<CountryResponseModel, Void>() { // from class: org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1.1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<CountryResponseModel, Void> responseMessage) {
                List<CountryModel> emptyList;
                CountryModel countryModel;
                Object obj2;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS) {
                    CountryResponseModel model = responseMessage.getModel();
                    if (model == null || (emptyList = model.getResponse()) == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
                    mutableState.setValue(emptyList);
                    CountryModel country = UserService.this.getShortProfile().getUserModel().getCountry();
                    MutableState<CountryModel> mutableState5 = mutableState2;
                    if (country != null) {
                        Iterator<T> it = emptyList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it.next();
                                if (((CountryModel) obj2).getId() == country.getId()) {
                                    break;
                                }
                            }
                        }
                        countryModel = (CountryModel) obj2;
                        if (countryModel == null) {
                            countryModel = (CountryModel) CollectionsKt.firstOrNull((List) emptyList);
                        }
                    } else {
                        countryModel = (CountryModel) CollectionsKt.firstOrNull((List) emptyList);
                    }
                    mutableState5.setValue(countryModel);
                    ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$8(mutableState3, false);
                    return;
                }
                mutableState4.setValue(context.getString(R.string.error_occured));
                ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$8(mutableState3, false);
            }
        }, null);
        return Unit.INSTANCE;
    }
}
