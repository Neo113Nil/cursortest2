package org.betup.ui.fragment.support.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.model.VKAttachments;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.rrweb.RRWebVideoEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.support.CloseSupportChatInteractor;
import org.betup.model.remote.api.rest.support.CreateSupportChatInteractor;
import org.betup.model.remote.api.rest.support.GetSupportCategoriesInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatMessagesInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatsInteractor;
import org.betup.model.remote.api.rest.support.GetV7FAQInteractor;
import org.betup.model.remote.api.rest.support.GetV7SupportInfoInteractor;
import org.betup.model.remote.api.rest.support.GetV7SupportMessagesInteractor;
import org.betup.model.remote.api.rest.support.SendSupportChatMessageInteractor;
import org.betup.model.remote.api.rest.support.SendV7SupportMessageInteractor;
import org.betup.model.remote.api.rest.user.CancelAccountDeletionRequestInteractor;
import org.betup.model.remote.api.rest.user.GetDeleteAccountInfoInteractor;
import org.betup.model.remote.api.rest.user.SendDeleteAccountInteractor;
import org.betup.model.remote.api.rest.user.SendV7ReportInteractor;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.PageOptions;
import org.betup.model.remote.entity.messaging.CorrespondentModel;
import org.betup.model.remote.entity.support.FAQDataModel;
import org.betup.model.remote.entity.support.FAQModel;
import org.betup.model.remote.entity.support.MessageExposeDto;
import org.betup.model.remote.entity.support.MessageWithReactionsDto;
import org.betup.model.remote.entity.support.SupportCategoryDto;
import org.betup.model.remote.entity.support.SupportChatDto;
import org.betup.model.remote.entity.support.V7SupportMessageDto;
import org.betup.model.remote.entity.support.V7SupportMessageUserDto;
import org.betup.model.remote.entity.support.V7SupportMessageWithReactionsDto;
import org.betup.model.remote.entity.support.V7SupportMessagesPageDto;
import org.betup.model.remote.entity.support.V7SupportPageOptionsDto;
import org.betup.model.remote.entity.support.V7SupportUserDto;
import org.betup.model.remote.entity.user.AccountDeletionRequest;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.support.compose.MyDataState;
import org.betup.ui.fragment.support.compose.SupportChatState;
import org.betup.ui.fragment.support.compose.SupportEvent;
import org.betup.ui.fragment.support.compose.SupportFaqItem;
import org.betup.ui.fragment.support.compose.SupportFaqState;
import org.betup.ui.fragment.support.compose.SupportFeedbackState;
import org.betup.ui.fragment.support.compose.SupportStatusType;
import org.betup.ui.fragment.support.compose.SupportTicketDetailState;
import org.betup.ui.fragment.support.compose.SupportTicketItem;
import org.betup.ui.fragment.support.compose.SupportTicketListState;
import org.betup.ui.fragment.support.compose.SupportUiState;
import org.betup.ui.fragment.support.compose.TicketStatus;
import org.betup.ui.fragment.user.compose.messages.MessageBubbleUi;
import org.betup.utils.AppVersionUtil;
import org.betup.utils.DateHelper;
import org.betup.utils.SupportStatusCalculator;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportController.kt */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ð\u00012\u00020\u0001:\u0002ð\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0092\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0086\u00012\u000b\b\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010h2\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010k¢\u0006\u0003\u0010\u0097\u0001J\b\u0010\u0098\u0001\u001a\u00030\u0093\u0001J\u0011\u0010\u0099\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u009a\u0001\u001a\u00020hJ\b\u0010\u009b\u0001\u001a\u00030\u0093\u0001J\b\u0010\u009f\u0001\u001a\u00030\u0093\u0001J\b\u0010 \u0001\u001a\u00030\u0093\u0001J\b\u0010¡\u0001\u001a\u00030\u0093\u0001J\u0011\u0010¢\u0001\u001a\u00030\u0093\u00012\u0007\u0010£\u0001\u001a\u00020kJ\n\u0010¤\u0001\u001a\u00030\u0093\u0001H\u0002J\u0014\u0010¨\u0001\u001a\u00030\u0093\u00012\b\u0010©\u0001\u001a\u00030¦\u0001H\u0002J\u0014\u0010ª\u0001\u001a\u00030«\u00012\b\u0010¬\u0001\u001a\u00030¦\u0001H\u0002J\u001d\u0010¯\u0001\u001a\u00030°\u00012\b\u0010±\u0001\u001a\u00030²\u00012\u0007\u0010³\u0001\u001a\u00020hH\u0002J\t\u0010¶\u0001\u001a\u00020~H\u0002J\u0011\u0010¹\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u009a\u0001\u001a\u00020hJ\u0011\u0010º\u0001\u001a\u00030\u0093\u00012\u0007\u0010»\u0001\u001a\u00020kJ\u0011\u0010¼\u0001\u001a\u00030\u0093\u00012\u0007\u0010½\u0001\u001a\u00020kJ\b\u0010À\u0001\u001a\u00030\u0093\u0001J\u0019\u0010Á\u0001\u001a\u00020k2\n\u0010Â\u0001\u001a\u0005\u0018\u00010Ã\u0001¢\u0006\u0003\u0010Ä\u0001J\b\u0010Å\u0001\u001a\u00030\u0093\u0001J\b\u0010Æ\u0001\u001a\u00030\u0093\u0001J\u0019\u0010Ç\u0001\u001a\u00030\u0093\u00012\r\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020|0jH\u0002J\n\u0010É\u0001\u001a\u00030\u0093\u0001H\u0002J\u001a\u0010Ê\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ë\u0001\u001a\u00020k2\u0007\u0010Ì\u0001\u001a\u00020kJ\u001b\u0010Í\u0001\u001a\u00020k2\u0007\u0010Ë\u0001\u001a\u00020k2\u0007\u0010Ì\u0001\u001a\u00020kH\u0002J\u0013\u0010Î\u0001\u001a\u00020~2\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0002J\u0014\u0010Ñ\u0001\u001a\u00020~2\t\u0010Ò\u0001\u001a\u0004\u0018\u00010kH\u0002J\u0011\u0010Ó\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ô\u0001\u001a\u00020kJ\u0011\u0010Õ\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ô\u0001\u001a\u00020kJ\u0011\u0010Ö\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ô\u0001\u001a\u00020kJ\u0011\u0010×\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ô\u0001\u001a\u00020kJ\u001a\u0010Ø\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ô\u0001\u001a\u00020k2\u0007\u0010½\u0001\u001a\u00020kJ\u0011\u0010Ù\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ô\u0001\u001a\u00020kJ\r\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020|0jJ\b\u0010Û\u0001\u001a\u00030\u0093\u0001J\b\u0010Þ\u0001\u001a\u00030\u0093\u0001J\t\u0010ß\u0001\u001a\u00020kH\u0002J\u0011\u0010à\u0001\u001a\u00030\u0093\u00012\u0007\u0010»\u0001\u001a\u00020kJ\u0011\u0010á\u0001\u001a\u00030\u0093\u00012\u0007\u0010½\u0001\u001a\u00020kJ\b\u0010â\u0001\u001a\u00030\u0093\u0001J\b\u0010ã\u0001\u001a\u00030\u0093\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010R\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010X\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u000e\u0010d\u001a\u00020eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020h0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0j0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020m0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010n\u001a\b\u0012\u0004\u0012\u00020o0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010p\u001a\b\u0012\u0004\u0012\u00020q0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010r\u001a\b\u0012\u0004\u0012\u00020s0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020u0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010v\u001a\b\u0012\u0004\u0012\u00020w0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\b\u0012\u0004\u0012\u00020z0yX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020|0jX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020~X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u007f\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020~X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020~X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020~X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020~X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0085\u0001\u001a\u00030\u0086\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0087\u0001\u001a\u00030\u0088\u0001X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u008a\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u009c\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u009e\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010¥\u0001\u001a\u0011\u0012\u0005\u0012\u00030¦\u0001\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u00ad\u0001\u001a\u0010\u0012\u0005\u0012\u00030®\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010´\u0001\u001a\u0010\u0012\u0005\u0012\u00030µ\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010·\u0001\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010¸\u0001\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010¾\u0001\u001a\u0010\u0012\u0005\u0012\u00030¿\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010Ü\u0001\u001a\u0018\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ð\u00010Ý\u0001\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ä\u0001\u001a\u0011\u0012\u0005\u0012\u00030å\u0001\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010æ\u0001\u001a\u0011\u0012\u0005\u0012\u00030å\u0001\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ç\u0001\u001a\u0011\u0012\u0005\u0012\u00030å\u0001\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010è\u0001\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0j\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010é\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ð\u0001\u0012\u0005\u0012\u00030§\u00010\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010ê\u0001\u001a\u0010\u0012\u0005\u0012\u00030Ð\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010ë\u0001\u001a\u0017\u0012\f\u0012\n\u0012\u0005\u0012\u00030ì\u00010Ý\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010í\u0001\u001a\u0010\u0012\u0005\u0012\u00030î\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010ï\u0001\u001a\u0010\u0012\u0005\u0012\u00030¿\u0001\u0012\u0004\u0012\u00020k0\u009d\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006ñ\u0001"}, d2 = {"Lorg/betup/ui/fragment/support/controller/SupportController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getV7FAQInteractor", "Lorg/betup/model/remote/api/rest/support/GetV7FAQInteractor;", "getGetV7FAQInteractor", "()Lorg/betup/model/remote/api/rest/support/GetV7FAQInteractor;", "setGetV7FAQInteractor", "(Lorg/betup/model/remote/api/rest/support/GetV7FAQInteractor;)V", "getV7SupportInfoInteractor", "Lorg/betup/model/remote/api/rest/support/GetV7SupportInfoInteractor;", "getGetV7SupportInfoInteractor", "()Lorg/betup/model/remote/api/rest/support/GetV7SupportInfoInteractor;", "setGetV7SupportInfoInteractor", "(Lorg/betup/model/remote/api/rest/support/GetV7SupportInfoInteractor;)V", "getV7SupportMessagesInteractor", "Lorg/betup/model/remote/api/rest/support/GetV7SupportMessagesInteractor;", "getGetV7SupportMessagesInteractor", "()Lorg/betup/model/remote/api/rest/support/GetV7SupportMessagesInteractor;", "setGetV7SupportMessagesInteractor", "(Lorg/betup/model/remote/api/rest/support/GetV7SupportMessagesInteractor;)V", "sendV7SupportMessageInteractor", "Lorg/betup/model/remote/api/rest/support/SendV7SupportMessageInteractor;", "getSendV7SupportMessageInteractor", "()Lorg/betup/model/remote/api/rest/support/SendV7SupportMessageInteractor;", "setSendV7SupportMessageInteractor", "(Lorg/betup/model/remote/api/rest/support/SendV7SupportMessageInteractor;)V", "sendV7ReportInteractor", "Lorg/betup/model/remote/api/rest/user/SendV7ReportInteractor;", "getSendV7ReportInteractor", "()Lorg/betup/model/remote/api/rest/user/SendV7ReportInteractor;", "setSendV7ReportInteractor", "(Lorg/betup/model/remote/api/rest/user/SendV7ReportInteractor;)V", "getSupportChatsInteractor", "Lorg/betup/model/remote/api/rest/support/GetSupportChatsInteractor;", "getGetSupportChatsInteractor", "()Lorg/betup/model/remote/api/rest/support/GetSupportChatsInteractor;", "setGetSupportChatsInteractor", "(Lorg/betup/model/remote/api/rest/support/GetSupportChatsInteractor;)V", "createSupportChatInteractor", "Lorg/betup/model/remote/api/rest/support/CreateSupportChatInteractor;", "getCreateSupportChatInteractor", "()Lorg/betup/model/remote/api/rest/support/CreateSupportChatInteractor;", "setCreateSupportChatInteractor", "(Lorg/betup/model/remote/api/rest/support/CreateSupportChatInteractor;)V", "getSupportChatInteractor", "Lorg/betup/model/remote/api/rest/support/GetSupportChatInteractor;", "getGetSupportChatInteractor", "()Lorg/betup/model/remote/api/rest/support/GetSupportChatInteractor;", "setGetSupportChatInteractor", "(Lorg/betup/model/remote/api/rest/support/GetSupportChatInteractor;)V", "getSupportChatMessagesInteractor", "Lorg/betup/model/remote/api/rest/support/GetSupportChatMessagesInteractor;", "getGetSupportChatMessagesInteractor", "()Lorg/betup/model/remote/api/rest/support/GetSupportChatMessagesInteractor;", "setGetSupportChatMessagesInteractor", "(Lorg/betup/model/remote/api/rest/support/GetSupportChatMessagesInteractor;)V", "sendSupportChatMessageInteractor", "Lorg/betup/model/remote/api/rest/support/SendSupportChatMessageInteractor;", "getSendSupportChatMessageInteractor", "()Lorg/betup/model/remote/api/rest/support/SendSupportChatMessageInteractor;", "setSendSupportChatMessageInteractor", "(Lorg/betup/model/remote/api/rest/support/SendSupportChatMessageInteractor;)V", "closeSupportChatInteractor", "Lorg/betup/model/remote/api/rest/support/CloseSupportChatInteractor;", "getCloseSupportChatInteractor", "()Lorg/betup/model/remote/api/rest/support/CloseSupportChatInteractor;", "setCloseSupportChatInteractor", "(Lorg/betup/model/remote/api/rest/support/CloseSupportChatInteractor;)V", "getSupportCategoriesInteractor", "Lorg/betup/model/remote/api/rest/support/GetSupportCategoriesInteractor;", "getGetSupportCategoriesInteractor", "()Lorg/betup/model/remote/api/rest/support/GetSupportCategoriesInteractor;", "setGetSupportCategoriesInteractor", "(Lorg/betup/model/remote/api/rest/support/GetSupportCategoriesInteractor;)V", "getDeleteAccountInfoInteractor", "Lorg/betup/model/remote/api/rest/user/GetDeleteAccountInfoInteractor;", "getGetDeleteAccountInfoInteractor", "()Lorg/betup/model/remote/api/rest/user/GetDeleteAccountInfoInteractor;", "setGetDeleteAccountInfoInteractor", "(Lorg/betup/model/remote/api/rest/user/GetDeleteAccountInfoInteractor;)V", "sendDeleteAccountInteractor", "Lorg/betup/model/remote/api/rest/user/SendDeleteAccountInteractor;", "getSendDeleteAccountInteractor", "()Lorg/betup/model/remote/api/rest/user/SendDeleteAccountInteractor;", "setSendDeleteAccountInteractor", "(Lorg/betup/model/remote/api/rest/user/SendDeleteAccountInteractor;)V", "cancelAccountDeletionRequestInteractor", "Lorg/betup/model/remote/api/rest/user/CancelAccountDeletionRequestInteractor;", "getCancelAccountDeletionRequestInteractor", "()Lorg/betup/model/remote/api/rest/user/CancelAccountDeletionRequestInteractor;", "setCancelAccountDeletionRequestInteractor", "(Lorg/betup/model/remote/api/rest/user/CancelAccountDeletionRequestInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "_selectedTab", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_tabs", "", "", "_faqState", "Lorg/betup/ui/fragment/support/compose/SupportFaqState;", "_chatState", "Lorg/betup/ui/fragment/support/compose/SupportChatState;", "_feedbackState", "Lorg/betup/ui/fragment/support/compose/SupportFeedbackState;", "_ticketListState", "Lorg/betup/ui/fragment/support/compose/SupportTicketListState;", "_ticketDetailState", "Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;", "_myDataState", "Lorg/betup/ui/fragment/support/compose/MyDataState;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "supportCategories", "Lorg/betup/model/remote/entity/support/SupportCategoryDto;", "pendingCreateTicketRequest", "", "ticketMessagesContinuationToken", "isTicketMessagesLoadingMore", "chatContinuationToken", "isChatLoadingInitial", "isChatLoadingMore", "initialized", "appContext", "Landroid/content/Context;", "supportPrefs", "Landroid/content/SharedPreferences;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/betup/ui/fragment/support/compose/SupportUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialize", "", "context", "preselectedTypeIndex", "prefilledMessage", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)V", "destroy", "setSelectedTab", "index", "refreshFaq", "faqListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/support/FAQModel;", "refreshSupportAgent", "refreshChat", "loadMoreChat", "sendChatMessage", "text", "loadSupportMessages", "supportInfoListener", "Lorg/betup/model/remote/entity/support/V7SupportUserDto;", "Ljava/lang/Void;", "applySupportAgent", "model", "convertToCorrespondentModel", "Lorg/betup/model/remote/entity/messaging/CorrespondentModel;", "dto", "chatMessagesListener", "Lorg/betup/model/remote/entity/support/V7SupportMessagesPageDto;", "convertToBubbleUi", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "messageWithReactions", "Lorg/betup/model/remote/entity/support/V7SupportMessageWithReactionsDto;", "currentUserId", "sendChatMessageListener", "Lorg/betup/model/remote/entity/support/V7SupportMessageDto;", "shouldShowSupportChatDialog", "pendingFeedbackType", "pendingFeedbackEmail", "onFeedbackTypeSelected", "onFeedbackEmailChanged", "email", "sendFeedback", "message", "feedbackListener", "Lokhttp3/ResponseBody;", "resetFeedbackSuccess", "calculateTimestamp", "timestamp", "", "(Ljava/lang/Long;)Ljava/lang/String;", "refreshSupportCategories", "requestCreateTicket", "emitCreateTicketDialog", "categories", "dismissLegacyTicketDetail", "createTicket", "details", "categoryId", "deriveChatName", "isLegacyDefaultSupportChat", "chat", "Lorg/betup/model/remote/entity/support/SupportChatDto;", "isLegacyDefaultSupportChatName", "chatName", "openTicket", "chatId", "refreshTicketDetails", "refreshTicketMessages", "loadMoreTicketMessages", "sendTicketMessage", "closeTicket", "getSupportCategories", "refreshTicketList", "ticketListListener", "Lorg/betup/model/remote/entity/PageModel;", "refreshMyData", "getUserEmail", "updateMyDataEmail", "updateMyDataMessage", "deleteAccount", "cancelDeletionRequest", "myDataListener", "Lorg/betup/model/remote/entity/user/AccountDeletionRequest;", "deleteAccountListener", "cancelDeletionRequestListener", "supportCategoriesListener", "createTicketListener", "ticketDetailsListener", "ticketMessagesListener", "Lorg/betup/model/remote/entity/support/MessageWithReactionsDto;", "sendTicketMessageListener", "Lorg/betup/model/remote/entity/support/MessageExposeDto;", "closeTicketListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportController {
    private static final int CHAT_NAME_MAX_LENGTH = 80;
    private static final String KEY_LAST_CHAT_TIMESTAMP = "last_support_chat_timestamp";
    private static final String KEY_TOTAL_CHAT_MESSAGES = "total_support_chat_messages";
    private static final String LEGACY_DEFAULT_SUPPORT_CATEGORY_ID = "OTHER";
    private static final String LEGACY_DEFAULT_SUPPORT_CHAT_NAME = "Support";
    private static final String SUPPORT_PREFS_NAME = "support_controller_prefs";
    private final MutableStateFlow<SupportChatState> _chatState;
    private final MutableSharedFlow<SupportEvent> _events;
    private final MutableStateFlow<SupportFaqState> _faqState;
    private final MutableStateFlow<SupportFeedbackState> _feedbackState;
    private final MutableStateFlow<MyDataState> _myDataState;
    private final MutableStateFlow<Integer> _selectedTab;
    private final MutableStateFlow<List<String>> _tabs;
    private final MutableStateFlow<SupportTicketDetailState> _ticketDetailState;
    private final MutableStateFlow<SupportTicketListState> _ticketListState;
    private Context appContext;

    @Inject
    public CancelAccountDeletionRequestInteractor cancelAccountDeletionRequestInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<AccountDeletionRequest, Void> cancelDeletionRequestListener;
    private String chatContinuationToken;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SupportMessagesPageDto, String> chatMessagesListener;

    @Inject
    public CloseSupportChatInteractor closeSupportChatInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, String> closeTicketListener;
    private final CoroutineScope controllerScope;

    @Inject
    public CreateSupportChatInteractor createSupportChatInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<SupportChatDto, Void> createTicketListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<AccountDeletionRequest, Void> deleteAccountListener;
    private final SharedFlow<SupportEvent> events;
    private final BaseCachedSharedInteractor.OnFetchedListener<FAQModel, String> faqListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, String> feedbackListener;

    @Inject
    public GetDeleteAccountInfoInteractor getDeleteAccountInfoInteractor;

    @Inject
    public GetSupportCategoriesInteractor getSupportCategoriesInteractor;

    @Inject
    public GetSupportChatInteractor getSupportChatInteractor;

    @Inject
    public GetSupportChatMessagesInteractor getSupportChatMessagesInteractor;

    @Inject
    public GetSupportChatsInteractor getSupportChatsInteractor;

    @Inject
    public GetV7FAQInteractor getV7FAQInteractor;

    @Inject
    public GetV7SupportInfoInteractor getV7SupportInfoInteractor;

    @Inject
    public GetV7SupportMessagesInteractor getV7SupportMessagesInteractor;
    private boolean initialized;
    private boolean isChatLoadingInitial;
    private boolean isChatLoadingMore;
    private boolean isTicketMessagesLoadingMore;
    private final BaseCachedSharedInteractor.OnFetchedListener<AccountDeletionRequest, Void> myDataListener;
    private boolean pendingCreateTicketRequest;
    private String pendingFeedbackEmail;
    private String pendingFeedbackType;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SupportMessageDto, String> sendChatMessageListener;

    @Inject
    public SendDeleteAccountInteractor sendDeleteAccountInteractor;

    @Inject
    public SendSupportChatMessageInteractor sendSupportChatMessageInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<MessageExposeDto, String> sendTicketMessageListener;

    @Inject
    public SendV7ReportInteractor sendV7ReportInteractor;

    @Inject
    public SendV7SupportMessageInteractor sendV7SupportMessageInteractor;
    private List<? extends SupportCategoryDto> supportCategories;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<SupportCategoryDto>, Void> supportCategoriesListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SupportUserDto, Void> supportInfoListener;
    private SharedPreferences supportPrefs;
    private final BaseCachedSharedInteractor.OnFetchedListener<SupportChatDto, String> ticketDetailsListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<PageModel<SupportChatDto>, Void> ticketListListener;
    private String ticketMessagesContinuationToken;
    private final BaseCachedSharedInteractor.OnFetchedListener<PageModel<MessageWithReactionsDto>, String> ticketMessagesListener;
    private final StateFlow<SupportUiState> uiState;

    @Inject
    public UserService userService;
    public static final int $stable = 8;

    /* compiled from: SupportController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SupportStatusCalculator.SupportStatus.values().length];
            try {
                iArr[SupportStatusCalculator.SupportStatus.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SupportStatusCalculator.SupportStatus.WAS_HERE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportStatusCalculator.SupportStatus.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FetchStat.values().length];
            try {
                iArr2[FetchStat.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FetchStat.NO_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FetchStat.NO_CONNECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final void refreshChat() {
    }

    public final void refreshSupportAgent() {
    }

    @Inject
    public SupportController() {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.controllerScope = CoroutineScope;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this._selectedTab = MutableStateFlow;
        MutableStateFlow<List<String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._tabs = MutableStateFlow2;
        MutableStateFlow<SupportFaqState> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new SupportFaqState(false, null, null, 7, null));
        this._faqState = MutableStateFlow3;
        MutableStateFlow<SupportChatState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new SupportChatState(false, false, false, false, null, null, null, null, null, null, 1023, null));
        this._chatState = MutableStateFlow4;
        MutableStateFlow<SupportFeedbackState> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new SupportFeedbackState(null, 0, null, null, false, false, null, 127, null));
        this._feedbackState = MutableStateFlow5;
        MutableStateFlow<SupportTicketListState> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new SupportTicketListState(false, null, null, 7, null));
        this._ticketListState = MutableStateFlow6;
        MutableStateFlow<SupportTicketDetailState> MutableStateFlow7 = StateFlowKt.MutableStateFlow(new SupportTicketDetailState(null, 0L, null, false, false, false, false, false, null, null, 1023, null));
        this._ticketDetailState = MutableStateFlow7;
        MutableStateFlow<MyDataState> MutableStateFlow8 = StateFlowKt.MutableStateFlow(new MyDataState(false, false, null, null, false, false, null, false, 255, null));
        this._myDataState = MutableStateFlow8;
        MutableSharedFlow<SupportEvent> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = MutableSharedFlow$default;
        this.supportCategories = CollectionsKt.emptyList();
        this.events = FlowKt.asSharedFlow(MutableSharedFlow$default);
        final Flow[] flowArr = {MutableStateFlow, MutableStateFlow2, MutableStateFlow3, MutableStateFlow4, MutableStateFlow5, MutableStateFlow6, MutableStateFlow7, MutableStateFlow8};
        this.uiState = FlowKt.stateIn(new Flow<SupportUiState>() { // from class: org.betup.ui.fragment.support.controller.SupportController$special$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SupportUiState> flowCollector, Continuation continuation) {
                Flow[] flowArr2 = flowArr;
                final Flow[] flowArr3 = flowArr;
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<Object[]>() { // from class: org.betup.ui.fragment.support.controller.SupportController$special$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object[] invoke() {
                        return new Object[flowArr3.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return combineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "org.betup.ui.fragment.support.controller.SupportController$special$$inlined$combine$1$3", f = "SupportController.kt", i = {}, l = {MainActivity.CHALLENGE_TOUR}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: org.betup.ui.fragment.support.controller.SupportController$special$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super SupportUiState>, Object[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super SupportUiState> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = objArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Object obj2 = objArr[0];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) obj2).intValue();
                        Object obj3 = objArr[1];
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        List list = (List) obj3;
                        Object obj4 = objArr[2];
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.betup.ui.fragment.support.compose.SupportFaqState");
                        SupportFaqState supportFaqState = (SupportFaqState) obj4;
                        Object obj5 = objArr[3];
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type org.betup.ui.fragment.support.compose.SupportChatState");
                        SupportChatState supportChatState = (SupportChatState) obj5;
                        Object obj6 = objArr[4];
                        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type org.betup.ui.fragment.support.compose.SupportFeedbackState");
                        SupportFeedbackState supportFeedbackState = (SupportFeedbackState) obj6;
                        Object obj7 = objArr[5];
                        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type org.betup.ui.fragment.support.compose.SupportTicketListState");
                        SupportTicketListState supportTicketListState = (SupportTicketListState) obj7;
                        Object obj8 = objArr[6];
                        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type org.betup.ui.fragment.support.compose.SupportTicketDetailState");
                        Object obj9 = objArr[7];
                        Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type org.betup.ui.fragment.support.compose.MyDataState");
                        SupportUiState supportUiState = new SupportUiState(intValue, list, supportFaqState, supportChatState, supportFeedbackState, supportTicketListState, (SupportTicketDetailState) obj8, (MyDataState) obj9);
                        this.label = 1;
                        if (flowCollector.emit(supportUiState, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, CoroutineScope, SharingStarted.INSTANCE.getEagerly(), new SupportUiState(0, null, null, null, null, null, null, null, 255, null));
        this.faqListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.faqListener$lambda$5(SupportController.this, fetchedResponseMessage);
            }
        };
        this.supportInfoListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda11
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.supportInfoListener$lambda$8(SupportController.this, fetchedResponseMessage);
            }
        };
        this.chatMessagesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda12
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.chatMessagesListener$lambda$11(SupportController.this, fetchedResponseMessage);
            }
        };
        this.sendChatMessageListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda13
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.sendChatMessageListener$lambda$15(SupportController.this, fetchedResponseMessage);
            }
        };
        this.feedbackListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda14
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.feedbackListener$lambda$19(SupportController.this, fetchedResponseMessage);
            }
        };
        this.ticketListListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.ticketListListener$lambda$32(SupportController.this, fetchedResponseMessage);
            }
        };
        this.myDataListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.myDataListener$lambda$35(SupportController.this, fetchedResponseMessage);
            }
        };
        this.deleteAccountListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.deleteAccountListener$lambda$36(SupportController.this, fetchedResponseMessage);
            }
        };
        this.cancelDeletionRequestListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.cancelDeletionRequestListener$lambda$37(SupportController.this, fetchedResponseMessage);
            }
        };
        this.supportCategoriesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda5
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.supportCategoriesListener$lambda$39(SupportController.this, fetchedResponseMessage);
            }
        };
        this.createTicketListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda6
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.createTicketListener$lambda$40(SupportController.this, fetchedResponseMessage);
            }
        };
        this.ticketDetailsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda7
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.ticketDetailsListener$lambda$41(SupportController.this, fetchedResponseMessage);
            }
        };
        this.ticketMessagesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda8
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.ticketMessagesListener$lambda$47(SupportController.this, fetchedResponseMessage);
            }
        };
        this.sendTicketMessageListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda9
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.sendTicketMessageListener$lambda$50(SupportController.this, fetchedResponseMessage);
            }
        };
        this.closeTicketListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.support.controller.SupportController$$ExternalSyntheticLambda10
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SupportController.closeTicketListener$lambda$51(SupportController.this, fetchedResponseMessage);
            }
        };
    }

    public final GetV7FAQInteractor getGetV7FAQInteractor() {
        GetV7FAQInteractor getV7FAQInteractor = this.getV7FAQInteractor;
        if (getV7FAQInteractor != null) {
            return getV7FAQInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getV7FAQInteractor");
        return null;
    }

    public final void setGetV7FAQInteractor(GetV7FAQInteractor getV7FAQInteractor) {
        Intrinsics.checkNotNullParameter(getV7FAQInteractor, "<set-?>");
        this.getV7FAQInteractor = getV7FAQInteractor;
    }

    public final GetV7SupportInfoInteractor getGetV7SupportInfoInteractor() {
        GetV7SupportInfoInteractor getV7SupportInfoInteractor = this.getV7SupportInfoInteractor;
        if (getV7SupportInfoInteractor != null) {
            return getV7SupportInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getV7SupportInfoInteractor");
        return null;
    }

    public final void setGetV7SupportInfoInteractor(GetV7SupportInfoInteractor getV7SupportInfoInteractor) {
        Intrinsics.checkNotNullParameter(getV7SupportInfoInteractor, "<set-?>");
        this.getV7SupportInfoInteractor = getV7SupportInfoInteractor;
    }

    public final GetV7SupportMessagesInteractor getGetV7SupportMessagesInteractor() {
        GetV7SupportMessagesInteractor getV7SupportMessagesInteractor = this.getV7SupportMessagesInteractor;
        if (getV7SupportMessagesInteractor != null) {
            return getV7SupportMessagesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getV7SupportMessagesInteractor");
        return null;
    }

    public final void setGetV7SupportMessagesInteractor(GetV7SupportMessagesInteractor getV7SupportMessagesInteractor) {
        Intrinsics.checkNotNullParameter(getV7SupportMessagesInteractor, "<set-?>");
        this.getV7SupportMessagesInteractor = getV7SupportMessagesInteractor;
    }

    public final SendV7SupportMessageInteractor getSendV7SupportMessageInteractor() {
        SendV7SupportMessageInteractor sendV7SupportMessageInteractor = this.sendV7SupportMessageInteractor;
        if (sendV7SupportMessageInteractor != null) {
            return sendV7SupportMessageInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendV7SupportMessageInteractor");
        return null;
    }

    public final void setSendV7SupportMessageInteractor(SendV7SupportMessageInteractor sendV7SupportMessageInteractor) {
        Intrinsics.checkNotNullParameter(sendV7SupportMessageInteractor, "<set-?>");
        this.sendV7SupportMessageInteractor = sendV7SupportMessageInteractor;
    }

    public final SendV7ReportInteractor getSendV7ReportInteractor() {
        SendV7ReportInteractor sendV7ReportInteractor = this.sendV7ReportInteractor;
        if (sendV7ReportInteractor != null) {
            return sendV7ReportInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendV7ReportInteractor");
        return null;
    }

    public final void setSendV7ReportInteractor(SendV7ReportInteractor sendV7ReportInteractor) {
        Intrinsics.checkNotNullParameter(sendV7ReportInteractor, "<set-?>");
        this.sendV7ReportInteractor = sendV7ReportInteractor;
    }

    public final GetSupportChatsInteractor getGetSupportChatsInteractor() {
        GetSupportChatsInteractor getSupportChatsInteractor = this.getSupportChatsInteractor;
        if (getSupportChatsInteractor != null) {
            return getSupportChatsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSupportChatsInteractor");
        return null;
    }

    public final void setGetSupportChatsInteractor(GetSupportChatsInteractor getSupportChatsInteractor) {
        Intrinsics.checkNotNullParameter(getSupportChatsInteractor, "<set-?>");
        this.getSupportChatsInteractor = getSupportChatsInteractor;
    }

    public final CreateSupportChatInteractor getCreateSupportChatInteractor() {
        CreateSupportChatInteractor createSupportChatInteractor = this.createSupportChatInteractor;
        if (createSupportChatInteractor != null) {
            return createSupportChatInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createSupportChatInteractor");
        return null;
    }

    public final void setCreateSupportChatInteractor(CreateSupportChatInteractor createSupportChatInteractor) {
        Intrinsics.checkNotNullParameter(createSupportChatInteractor, "<set-?>");
        this.createSupportChatInteractor = createSupportChatInteractor;
    }

    public final GetSupportChatInteractor getGetSupportChatInteractor() {
        GetSupportChatInteractor getSupportChatInteractor = this.getSupportChatInteractor;
        if (getSupportChatInteractor != null) {
            return getSupportChatInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSupportChatInteractor");
        return null;
    }

    public final void setGetSupportChatInteractor(GetSupportChatInteractor getSupportChatInteractor) {
        Intrinsics.checkNotNullParameter(getSupportChatInteractor, "<set-?>");
        this.getSupportChatInteractor = getSupportChatInteractor;
    }

    public final GetSupportChatMessagesInteractor getGetSupportChatMessagesInteractor() {
        GetSupportChatMessagesInteractor getSupportChatMessagesInteractor = this.getSupportChatMessagesInteractor;
        if (getSupportChatMessagesInteractor != null) {
            return getSupportChatMessagesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSupportChatMessagesInteractor");
        return null;
    }

    public final void setGetSupportChatMessagesInteractor(GetSupportChatMessagesInteractor getSupportChatMessagesInteractor) {
        Intrinsics.checkNotNullParameter(getSupportChatMessagesInteractor, "<set-?>");
        this.getSupportChatMessagesInteractor = getSupportChatMessagesInteractor;
    }

    public final SendSupportChatMessageInteractor getSendSupportChatMessageInteractor() {
        SendSupportChatMessageInteractor sendSupportChatMessageInteractor = this.sendSupportChatMessageInteractor;
        if (sendSupportChatMessageInteractor != null) {
            return sendSupportChatMessageInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendSupportChatMessageInteractor");
        return null;
    }

    public final void setSendSupportChatMessageInteractor(SendSupportChatMessageInteractor sendSupportChatMessageInteractor) {
        Intrinsics.checkNotNullParameter(sendSupportChatMessageInteractor, "<set-?>");
        this.sendSupportChatMessageInteractor = sendSupportChatMessageInteractor;
    }

    public final CloseSupportChatInteractor getCloseSupportChatInteractor() {
        CloseSupportChatInteractor closeSupportChatInteractor = this.closeSupportChatInteractor;
        if (closeSupportChatInteractor != null) {
            return closeSupportChatInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("closeSupportChatInteractor");
        return null;
    }

    public final void setCloseSupportChatInteractor(CloseSupportChatInteractor closeSupportChatInteractor) {
        Intrinsics.checkNotNullParameter(closeSupportChatInteractor, "<set-?>");
        this.closeSupportChatInteractor = closeSupportChatInteractor;
    }

    public final GetSupportCategoriesInteractor getGetSupportCategoriesInteractor() {
        GetSupportCategoriesInteractor getSupportCategoriesInteractor = this.getSupportCategoriesInteractor;
        if (getSupportCategoriesInteractor != null) {
            return getSupportCategoriesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSupportCategoriesInteractor");
        return null;
    }

    public final void setGetSupportCategoriesInteractor(GetSupportCategoriesInteractor getSupportCategoriesInteractor) {
        Intrinsics.checkNotNullParameter(getSupportCategoriesInteractor, "<set-?>");
        this.getSupportCategoriesInteractor = getSupportCategoriesInteractor;
    }

    public final GetDeleteAccountInfoInteractor getGetDeleteAccountInfoInteractor() {
        GetDeleteAccountInfoInteractor getDeleteAccountInfoInteractor = this.getDeleteAccountInfoInteractor;
        if (getDeleteAccountInfoInteractor != null) {
            return getDeleteAccountInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getDeleteAccountInfoInteractor");
        return null;
    }

    public final void setGetDeleteAccountInfoInteractor(GetDeleteAccountInfoInteractor getDeleteAccountInfoInteractor) {
        Intrinsics.checkNotNullParameter(getDeleteAccountInfoInteractor, "<set-?>");
        this.getDeleteAccountInfoInteractor = getDeleteAccountInfoInteractor;
    }

    public final SendDeleteAccountInteractor getSendDeleteAccountInteractor() {
        SendDeleteAccountInteractor sendDeleteAccountInteractor = this.sendDeleteAccountInteractor;
        if (sendDeleteAccountInteractor != null) {
            return sendDeleteAccountInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendDeleteAccountInteractor");
        return null;
    }

    public final void setSendDeleteAccountInteractor(SendDeleteAccountInteractor sendDeleteAccountInteractor) {
        Intrinsics.checkNotNullParameter(sendDeleteAccountInteractor, "<set-?>");
        this.sendDeleteAccountInteractor = sendDeleteAccountInteractor;
    }

    public final CancelAccountDeletionRequestInteractor getCancelAccountDeletionRequestInteractor() {
        CancelAccountDeletionRequestInteractor cancelAccountDeletionRequestInteractor = this.cancelAccountDeletionRequestInteractor;
        if (cancelAccountDeletionRequestInteractor != null) {
            return cancelAccountDeletionRequestInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cancelAccountDeletionRequestInteractor");
        return null;
    }

    public final void setCancelAccountDeletionRequestInteractor(CancelAccountDeletionRequestInteractor cancelAccountDeletionRequestInteractor) {
        Intrinsics.checkNotNullParameter(cancelAccountDeletionRequestInteractor, "<set-?>");
        this.cancelAccountDeletionRequestInteractor = cancelAccountDeletionRequestInteractor;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final SharedFlow<SupportEvent> getEvents() {
        return this.events;
    }

    public final StateFlow<SupportUiState> getUiState() {
        return this.uiState;
    }

    public static /* synthetic */ void initialize$default(SupportController supportController, Context context, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        supportController.initialize(context, num, str);
    }

    public final void initialize(Context context, Integer preselectedTypeIndex, String prefilledMessage) {
        Object m10853constructorimpl;
        MyDataState copy;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.initialized) {
            return;
        }
        this.initialized = true;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        Context context2 = null;
        if (applicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            applicationContext = null;
        }
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Context context3 = this.appContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context3 = null;
        }
        this.supportPrefs = context3.getSharedPreferences(SUPPORT_PREFS_NAME, 0);
        MutableStateFlow<List<String>> mutableStateFlow = this._tabs;
        String[] strArr = new String[3];
        Context context4 = this.appContext;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context4 = null;
        }
        strArr[0] = context4.getString(R.string.faq);
        Context context5 = this.appContext;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context5 = null;
        }
        strArr[1] = context5.getString(R.string.support);
        Context context6 = this.appContext;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context6 = null;
        }
        strArr[2] = context6.getString(R.string.my_data);
        mutableStateFlow.setValue(CollectionsKt.listOf((Object[]) strArr));
        boolean isAnonymous = getUserService().isAnonymous();
        try {
            Result.Companion companion = Result.INSTANCE;
            SupportController supportController = this;
            String email = getUserService().getShortProfile().getUserModel().getEmail();
            if (email == null) {
                email = "";
            }
            m10853constructorimpl = Result.m10853constructorimpl(email);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = "";
        }
        String str = (String) m10853constructorimpl;
        MutableStateFlow<MyDataState> mutableStateFlow2 = this._myDataState;
        copy = r11.copy((r18 & 1) != 0 ? r11.isLoading : false, (r18 & 2) != 0 ? r11.hasActiveRequest : false, (r18 & 4) != 0 ? r11.email : str, (r18 & 8) != 0 ? r11.message : null, (r18 & 16) != 0 ? r11.isSending : false, (r18 & 32) != 0 ? r11.isCancelling : false, (r18 & 64) != 0 ? r11.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow2.getValue().isGuest : isAnonymous);
        mutableStateFlow2.setValue(copy);
        String[] strArr2 = new String[5];
        Context context7 = this.appContext;
        if (context7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context7 = null;
        }
        strArr2[0] = context7.getString(R.string.bug_report);
        Context context8 = this.appContext;
        if (context8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context8 = null;
        }
        strArr2[1] = context8.getString(R.string.improvements_idea);
        Context context9 = this.appContext;
        if (context9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context9 = null;
        }
        strArr2[2] = context9.getString(R.string.partnership);
        Context context10 = this.appContext;
        if (context10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context10 = null;
        }
        strArr2[3] = context10.getString(R.string.delete_my_account);
        Context context11 = this.appContext;
        if (context11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        } else {
            context2 = context11;
        }
        strArr2[4] = context2.getString(R.string.other);
        List listOf = CollectionsKt.listOf((Object[]) strArr2);
        int coerceIn = preselectedTypeIndex != null ? RangesKt.coerceIn(preselectedTypeIndex.intValue(), 0, CollectionsKt.getLastIndex(listOf)) : 0;
        MutableStateFlow<SupportFeedbackState> mutableStateFlow3 = this._feedbackState;
        mutableStateFlow3.setValue(SupportFeedbackState.copy$default(mutableStateFlow3.getValue(), listOf, coerceIn, str, prefilledMessage == null ? "" : prefilledMessage, false, false, null, 16, null));
        refreshFaq();
        refreshTicketList();
        refreshSupportCategories();
    }

    public final void destroy() {
        CoroutineScopeKt.cancel$default(this.controllerScope, null, 1, null);
    }

    public final void setSelectedTab(int index) {
        MutableStateFlow<Integer> mutableStateFlow = this._selectedTab;
        Integer valueOf = Integer.valueOf(CollectionsKt.getLastIndex(this._tabs.getValue()));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        mutableStateFlow.setValue(Integer.valueOf(RangesKt.coerceIn(index, 0, valueOf != null ? valueOf.intValue() : 0)));
    }

    public final void refreshFaq() {
        Context context = null;
        if (this.getV7FAQInteractor == null) {
            Log.e("SupportController", "getV7FAQInteractor is not initialized");
            MutableStateFlow<SupportFaqState> mutableStateFlow = this._faqState;
            SupportFaqState value = mutableStateFlow.getValue();
            Context context2 = this.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            mutableStateFlow.setValue(SupportFaqState.copy$default(value, false, null, context.getString(R.string.error), 2, null));
            return;
        }
        MutableStateFlow<SupportFaqState> mutableStateFlow2 = this._faqState;
        mutableStateFlow2.setValue(SupportFaqState.copy$default(mutableStateFlow2.getValue(), true, null, null, 2, null));
        Bundle bundle = new Bundle();
        bundle.putString("lang", Locale.getDefault().getLanguage());
        Log.d("SupportController", "Refreshing FAQ with lang: " + Locale.getDefault().getLanguage());
        getGetV7FAQInteractor().load(this.faqListener, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void faqListener$lambda$5(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        Context context = null;
        Log.d("SupportController", "FAQ listener called: stat=" + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) + ", model=" + ((fetchedResponseMessage != null ? (FAQModel) fetchedResponseMessage.getModel() : null) != null));
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            Log.e("SupportController", "FAQ fetch failed: stat=" + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
            MutableStateFlow<SupportFaqState> mutableStateFlow = supportController._faqState;
            SupportFaqState value = mutableStateFlow.getValue();
            Context context2 = supportController.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            mutableStateFlow.setValue(SupportFaqState.copy$default(value, false, null, context.getString(R.string.error), 2, null));
            return;
        }
        List<FAQDataModel> items = ((FAQModel) fetchedResponseMessage.getModel()).getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        List<FAQDataModel> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FAQDataModel fAQDataModel = (FAQDataModel) obj;
            String str = "faq_" + fAQDataModel.getQuestion() + "_" + i;
            String question = fAQDataModel.getQuestion();
            String str2 = "";
            if (question == null) {
                question = "";
            }
            String answer = fAQDataModel.getAnswer();
            if (answer != null) {
                str2 = answer;
            }
            arrayList.add(new SupportFaqItem(str, question, str2));
            i = i2;
        }
        ArrayList arrayList2 = arrayList;
        Log.d("SupportController", "FAQ loaded successfully: " + arrayList2.size() + " items");
        supportController._faqState.setValue(new SupportFaqState(false, arrayList2, null));
    }

    public final void loadMoreChat() {
        String str;
        SupportChatState copy;
        if (this.isChatLoadingMore || (str = this.chatContinuationToken) == null || str.length() == 0) {
            return;
        }
        this.isChatLoadingMore = true;
        MutableStateFlow<SupportChatState> mutableStateFlow = this._chatState;
        copy = r2.copy((r22 & 1) != 0 ? r2.isLoading : false, (r22 & 2) != 0 ? r2.isLoadingMore : true, (r22 & 4) != 0 ? r2.hasMore : false, (r22 & 8) != 0 ? r2.isSending : false, (r22 & 16) != 0 ? r2.messages : null, (r22 & 32) != 0 ? r2.agentName : null, (r22 & 64) != 0 ? r2.agentAvatarUrl : null, (r22 & 128) != 0 ? r2.statusText : null, (r22 & 256) != 0 ? r2.statusType : null, (r22 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        loadSupportMessages();
    }

    public final void sendChatMessage(String text) {
        SupportChatState copy;
        Intrinsics.checkNotNullParameter(text, "text");
        if (StringsKt.isBlank(text) || this._chatState.getValue().isSending()) {
            return;
        }
        MutableStateFlow<SupportChatState> mutableStateFlow = this._chatState;
        copy = r4.copy((r22 & 1) != 0 ? r4.isLoading : false, (r22 & 2) != 0 ? r4.isLoadingMore : false, (r22 & 4) != 0 ? r4.hasMore : false, (r22 & 8) != 0 ? r4.isSending : true, (r22 & 16) != 0 ? r4.messages : null, (r22 & 32) != 0 ? r4.agentName : null, (r22 & 64) != 0 ? r4.agentAvatarUrl : null, (r22 & 128) != 0 ? r4.statusText : null, (r22 & 256) != 0 ? r4.statusType : null, (r22 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        Bundle bundle = new Bundle();
        bundle.putString("message", text);
        getSendV7SupportMessageInteractor().load(this.sendChatMessageListener, null, bundle);
    }

    private final void loadSupportMessages() {
        Bundle bundle = new Bundle();
        bundle.putString("continuationToken", this.chatContinuationToken);
        getGetV7SupportMessagesInteractor().load(this.chatMessagesListener, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void supportInfoListener$lambda$8(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            Log.w("SupportController", "Failed to load support user info: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
            return;
        }
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        supportController.applySupportAgent((V7SupportUserDto) model);
    }

    private final void applySupportAgent(V7SupportUserDto model) {
        String string;
        SupportStatusType supportStatusType;
        SupportChatState copy;
        CorrespondentModel convertToCorrespondentModel = convertToCorrespondentModel(model);
        SupportStatusCalculator.SupportStatus supportStatus = SupportStatusCalculator.getSupportStatus(convertToCorrespondentModel);
        int i = supportStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[supportStatus.ordinal()];
        Context context = null;
        if (i == 1) {
            Context context2 = this.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context2 = null;
            }
            string = context2.getString(R.string.support_status_online);
        } else if (i == 2) {
            Context context3 = this.appContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context3 = null;
            }
            string = context3.getString(R.string.support_status_was_here) + SupportStatusCalculator.resultTimeString(convertToCorrespondentModel);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context4 = this.appContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context4 = null;
            }
            string = context4.getString(R.string.support_status_offline);
        }
        String str = string;
        Intrinsics.checkNotNull(str);
        int i2 = supportStatus != null ? WhenMappings.$EnumSwitchMapping$0[supportStatus.ordinal()] : -1;
        if (i2 == 1) {
            supportStatusType = SupportStatusType.ONLINE;
        } else if (i2 == 2) {
            supportStatusType = SupportStatusType.AWAY;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            supportStatusType = SupportStatusType.OFFLINE;
        }
        SupportStatusType supportStatusType2 = supportStatusType;
        MutableStateFlow<SupportChatState> mutableStateFlow = this._chatState;
        SupportChatState value = mutableStateFlow.getValue();
        String name = model.getName();
        if (name == null) {
            Context context5 = this.appContext;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context5;
            }
            name = context.getString(R.string.support);
            Intrinsics.checkNotNullExpressionValue(name, "getString(...)");
        }
        copy = value.copy((r22 & 1) != 0 ? value.isLoading : false, (r22 & 2) != 0 ? value.isLoadingMore : false, (r22 & 4) != 0 ? value.hasMore : false, (r22 & 8) != 0 ? value.isSending : false, (r22 & 16) != 0 ? value.messages : null, (r22 & 32) != 0 ? value.agentName : name, (r22 & 64) != 0 ? value.agentAvatarUrl : model.getAvatarUrl(), (r22 & 128) != 0 ? value.statusText : str, (r22 & 256) != 0 ? value.statusType : supportStatusType2, (r22 & 512) != 0 ? value.errorMessage : null);
        mutableStateFlow.setValue(copy);
    }

    private final CorrespondentModel convertToCorrespondentModel(V7SupportUserDto dto) {
        CorrespondentModel correspondentModel = new CorrespondentModel();
        Long id = dto.getId();
        correspondentModel.setId(id != null ? (int) id.longValue() : 0);
        correspondentModel.setName(dto.getName());
        correspondentModel.setLanguage(dto.getLanguage());
        correspondentModel.setAvatarUrl(dto.getAvatarUrl());
        try {
            if (dto.getLastVisitedAt() != null) {
                correspondentModel.setLastVisitedAt(Date.from(Instant.parse(dto.getLastVisitedAt())));
            } else {
                correspondentModel.setLastVisitedAt(new Date(0L));
            }
        } catch (Exception e) {
            Log.w("SupportController", "Failed to parse lastVisitedAt: " + dto.getLastVisitedAt(), e);
            correspondentModel.setLastVisitedAt(new Date(0L));
        }
        return correspondentModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void chatMessagesListener$lambda$11(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        SupportChatState copy;
        Object m10853constructorimpl;
        SupportChatState copy2;
        supportController.isChatLoadingInitial = false;
        supportController.isChatLoadingMore = false;
        Context context = null;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            MutableStateFlow<SupportChatState> mutableStateFlow = supportController._chatState;
            SupportChatState value = mutableStateFlow.getValue();
            Context context2 = supportController.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            copy = value.copy((r22 & 1) != 0 ? value.isLoading : false, (r22 & 2) != 0 ? value.isLoadingMore : false, (r22 & 4) != 0 ? value.hasMore : false, (r22 & 8) != 0 ? value.isSending : false, (r22 & 16) != 0 ? value.messages : null, (r22 & 32) != 0 ? value.agentName : null, (r22 & 64) != 0 ? value.agentAvatarUrl : null, (r22 & 128) != 0 ? value.statusText : null, (r22 & 256) != 0 ? value.statusType : null, (r22 & 512) != 0 ? value.errorMessage : context.getString(R.string.error));
            mutableStateFlow.setValue(copy);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(supportController.getUserService().getShortProfile().getUserModel().getId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = -1;
        }
        Integer num = (Integer) m10853constructorimpl;
        List<V7SupportMessageWithReactionsDto> content = ((V7SupportMessagesPageDto) fetchedResponseMessage.getModel()).getContent();
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        List<V7SupportMessageWithReactionsDto> list = content;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (V7SupportMessageWithReactionsDto v7SupportMessageWithReactionsDto : list) {
            Intrinsics.checkNotNull(v7SupportMessageWithReactionsDto);
            Intrinsics.checkNotNull(num);
            arrayList.add(supportController.convertToBubbleUi(v7SupportMessageWithReactionsDto, num.intValue()));
        }
        ArrayList arrayList2 = arrayList;
        V7SupportPageOptionsDto pageOptions = ((V7SupportMessagesPageDto) fetchedResponseMessage.getModel()).getPageOptions();
        String continuationToken = pageOptions != null ? pageOptions.getContinuationToken() : null;
        MutableStateFlow<SupportChatState> mutableStateFlow2 = supportController._chatState;
        if (supportController.chatContinuationToken == null) {
            String str = continuationToken;
            copy2 = r7.copy((r22 & 1) != 0 ? r7.isLoading : false, (r22 & 2) != 0 ? r7.isLoadingMore : false, (r22 & 4) != 0 ? r7.hasMore : !(str == null || str.length() == 0), (r22 & 8) != 0 ? r7.isSending : false, (r22 & 16) != 0 ? r7.messages : arrayList2, (r22 & 32) != 0 ? r7.agentName : null, (r22 & 64) != 0 ? r7.agentAvatarUrl : null, (r22 & 128) != 0 ? r7.statusText : null, (r22 & 256) != 0 ? r7.statusType : null, (r22 & 512) != 0 ? mutableStateFlow2.getValue().errorMessage : null);
        } else {
            String str2 = continuationToken;
            copy2 = r13.copy((r22 & 1) != 0 ? r13.isLoading : false, (r22 & 2) != 0 ? r13.isLoadingMore : false, (r22 & 4) != 0 ? r13.hasMore : !(str2 == null || str2.length() == 0), (r22 & 8) != 0 ? r13.isSending : false, (r22 & 16) != 0 ? r13.messages : CollectionsKt.plus((Collection) supportController._chatState.getValue().getMessages(), (Iterable) arrayList2), (r22 & 32) != 0 ? r13.agentName : null, (r22 & 64) != 0 ? r13.agentAvatarUrl : null, (r22 & 128) != 0 ? r13.statusText : null, (r22 & 256) != 0 ? r13.statusType : null, (r22 & 512) != 0 ? mutableStateFlow2.getValue().errorMessage : null);
        }
        mutableStateFlow2.setValue(copy2);
        supportController.chatContinuationToken = continuationToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MessageBubbleUi convertToBubbleUi(V7SupportMessageWithReactionsDto messageWithReactions, int currentUserId) {
        String str;
        String str2;
        Object id;
        String message;
        V7SupportMessageDto message2 = messageWithReactions.getMessage();
        if (message2 == null) {
            message2 = new V7SupportMessageDto();
        }
        V7SupportMessageUserDto user = message2.getUser();
        if (user == null) {
            user = new V7SupportMessageUserDto();
        }
        String sendDate = message2.getSendDate();
        if (sendDate != null) {
            try {
                str = DateHelper.getTimeFromTimestamp(Instant.parse(sendDate).toEpochMilli());
            } catch (Exception unused) {
                str = "";
            }
            if (str != null) {
                str2 = str;
                id = message2.getId();
                if (id == null) {
                    id = Integer.valueOf(hashCode());
                }
                String obj = id.toString();
                Long id2 = user.getId();
                int longValue = id2 == null ? (int) id2.longValue() : -1;
                String name = user.getName();
                String str3 = name != null ? "" : name;
                String avatarUrl = user.getAvatarUrl();
                message = message2.getMessage();
                if (message == null) {
                    message = "";
                }
                Long id3 = user.getId();
                return new MessageBubbleUi(obj, longValue, str3, avatarUrl, message, str2, (id3 != null ? (int) id3.longValue() : -1) != currentUserId);
            }
        }
        str2 = "";
        id = message2.getId();
        if (id == null) {
        }
        String obj2 = id.toString();
        Long id22 = user.getId();
        if (id22 == null) {
        }
        String name2 = user.getName();
        if (name2 != null) {
        }
        String avatarUrl2 = user.getAvatarUrl();
        message = message2.getMessage();
        if (message == null) {
        }
        Long id32 = user.getId();
        return new MessageBubbleUi(obj2, longValue, str3, avatarUrl2, message, str2, (id32 != null ? (int) id32.longValue() : -1) != currentUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendChatMessageListener$lambda$15(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        SupportChatState copy;
        Object m10853constructorimpl;
        SupportChatState copy2;
        MutableStateFlow<SupportChatState> mutableStateFlow = supportController._chatState;
        copy = r3.copy((r22 & 1) != 0 ? r3.isLoading : false, (r22 & 2) != 0 ? r3.isLoadingMore : false, (r22 & 4) != 0 ? r3.hasMore : false, (r22 & 8) != 0 ? r3.isSending : false, (r22 & 16) != 0 ? r3.messages : null, (r22 & 32) != 0 ? r3.agentName : null, (r22 & 64) != 0 ? r3.agentAvatarUrl : null, (r22 & 128) != 0 ? r3.statusText : null, (r22 & 256) != 0 ? r3.statusType : null, (r22 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$sendChatMessageListener$1$1(supportController, null), 3, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(supportController.getUserService().getShortProfile().getUserModel().getId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = -1;
        }
        Integer num = (Integer) m10853constructorimpl;
        V7SupportMessageWithReactionsDto v7SupportMessageWithReactionsDto = new V7SupportMessageWithReactionsDto();
        v7SupportMessageWithReactionsDto.setMessage((V7SupportMessageDto) fetchedResponseMessage.getModel());
        Intrinsics.checkNotNull(num);
        MessageBubbleUi convertToBubbleUi = supportController.convertToBubbleUi(v7SupportMessageWithReactionsDto, num.intValue());
        MutableStateFlow<SupportChatState> mutableStateFlow2 = supportController._chatState;
        copy2 = r5.copy((r22 & 1) != 0 ? r5.isLoading : false, (r22 & 2) != 0 ? r5.isLoadingMore : false, (r22 & 4) != 0 ? r5.hasMore : false, (r22 & 8) != 0 ? r5.isSending : false, (r22 & 16) != 0 ? r5.messages : CollectionsKt.plus((Collection) CollectionsKt.listOf(convertToBubbleUi), (Iterable) supportController._chatState.getValue().getMessages()), (r22 & 32) != 0 ? r5.agentName : null, (r22 & 64) != 0 ? r5.agentAvatarUrl : null, (r22 & 128) != 0 ? r5.statusText : null, (r22 & 256) != 0 ? r5.statusType : null, (r22 & 512) != 0 ? mutableStateFlow2.getValue().errorMessage : null);
        mutableStateFlow2.setValue(copy2);
        BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$sendChatMessageListener$1$2(supportController, supportController.shouldShowSupportChatDialog(), null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldShowSupportChatDialog() {
        Object m10853constructorimpl;
        LocalDate localDate;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.supportPrefs == null) {
            return true;
        }
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        LocalDate localDate2 = now.toLocalDate();
        SharedPreferences sharedPreferences3 = this.supportPrefs;
        SharedPreferences sharedPreferences4 = null;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("supportPrefs");
            sharedPreferences3 = null;
        }
        String string = sharedPreferences3.getString(KEY_LAST_CHAT_TIMESTAMP, null);
        if (string != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SupportController supportController = this;
                m10853constructorimpl = Result.m10853constructorimpl(OffsetDateTime.parse(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                m10853constructorimpl = null;
            }
            OffsetDateTime offsetDateTime = (OffsetDateTime) m10853constructorimpl;
            if (offsetDateTime != null) {
                localDate = offsetDateTime.toLocalDate();
                sharedPreferences = this.supportPrefs;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("supportPrefs");
                    sharedPreferences = null;
                }
                int i = sharedPreferences.getInt(KEY_TOTAL_CHAT_MESSAGES, 0);
                boolean z = (i == 0 && localDate != null && Intrinsics.areEqual(localDate, localDate2)) ? false : true;
                int i2 = Intrinsics.areEqual(localDate, localDate2) ? 1 + i : 1;
                sharedPreferences2 = this.supportPrefs;
                if (sharedPreferences2 != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("supportPrefs");
                } else {
                    sharedPreferences4 = sharedPreferences2;
                }
                sharedPreferences4.edit().putString(KEY_LAST_CHAT_TIMESTAMP, now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)).putInt(KEY_TOTAL_CHAT_MESSAGES, i2).apply();
                return z;
            }
        }
        localDate = null;
        sharedPreferences = this.supportPrefs;
        if (sharedPreferences == null) {
        }
        int i3 = sharedPreferences.getInt(KEY_TOTAL_CHAT_MESSAGES, 0);
        if (i3 == 0) {
        }
        if (Intrinsics.areEqual(localDate, localDate2)) {
        }
        sharedPreferences2 = this.supportPrefs;
        if (sharedPreferences2 != null) {
        }
        sharedPreferences4.edit().putString(KEY_LAST_CHAT_TIMESTAMP, now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)).putInt(KEY_TOTAL_CHAT_MESSAGES, i2).apply();
        return z;
    }

    public final void onFeedbackTypeSelected(int index) {
        MutableStateFlow<SupportFeedbackState> mutableStateFlow = this._feedbackState;
        mutableStateFlow.setValue(SupportFeedbackState.copy$default(mutableStateFlow.getValue(), null, RangesKt.coerceIn(index, 0, CollectionsKt.getLastIndex(this._feedbackState.getValue().getTypes())), null, null, false, false, null, 125, null));
    }

    public final void onFeedbackEmailChanged(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        MutableStateFlow<SupportFeedbackState> mutableStateFlow = this._feedbackState;
        mutableStateFlow.setValue(SupportFeedbackState.copy$default(mutableStateFlow.getValue(), null, 0, email, null, false, false, null, 123, null));
    }

    public final void sendFeedback(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Context context = null;
        if (message.length() < 5 || this._feedbackState.getValue().isSending()) {
            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new SupportController$sendFeedback$1(this, null), 3, null);
            return;
        }
        if (!StringsKt.contains$default((CharSequence) this._feedbackState.getValue().getEmail(), (CharSequence) "@", false, 2, (Object) null)) {
            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new SupportController$sendFeedback$2(this, null), 3, null);
            return;
        }
        MutableStateFlow<SupportFeedbackState> mutableStateFlow = this._feedbackState;
        mutableStateFlow.setValue(SupportFeedbackState.copy$default(mutableStateFlow.getValue(), null, 0, null, null, true, false, null, 47, null));
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        bundle.putString("email", this._feedbackState.getValue().getEmail());
        bundle.putString("deviceInfo", AppVersionUtil.getDeviceInfo());
        String str = (String) CollectionsKt.getOrNull(this._feedbackState.getValue().getTypes(), this._feedbackState.getValue().getSelectedTypeIndex());
        if (str == null) {
            Context context2 = this.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            str = context.getString(R.string.other);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this.pendingFeedbackType = str;
        this.pendingFeedbackEmail = this._feedbackState.getValue().getEmail();
        getSendV7ReportInteractor().load(this.feedbackListener, str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void feedbackListener$lambda$19(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        MutableStateFlow<SupportFeedbackState> mutableStateFlow = supportController._feedbackState;
        mutableStateFlow.setValue(SupportFeedbackState.copy$default(mutableStateFlow.getValue(), null, 0, null, null, false, false, null, 111, null));
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            MutableStateFlow<SupportFeedbackState> mutableStateFlow2 = supportController._feedbackState;
            SupportFeedbackState value = mutableStateFlow2.getValue();
            Context context = supportController.appContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context = null;
            }
            mutableStateFlow2.setValue(SupportFeedbackState.copy$default(value, null, 0, null, null, false, false, context.getString(R.string.error), 63, null));
            BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$feedbackListener$1$1(supportController, null), 3, null);
            supportController.pendingFeedbackType = null;
            supportController.pendingFeedbackEmail = null;
            return;
        }
        MutableStateFlow<SupportFeedbackState> mutableStateFlow3 = supportController._feedbackState;
        mutableStateFlow3.setValue(SupportFeedbackState.copy$default(mutableStateFlow3.getValue(), null, 0, null, null, false, true, null, 31, null));
        BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$feedbackListener$1$2(supportController, null), 3, null);
        supportController.pendingFeedbackType = null;
        supportController.pendingFeedbackEmail = null;
    }

    public final void resetFeedbackSuccess() {
        MutableStateFlow<SupportFeedbackState> mutableStateFlow = this._feedbackState;
        mutableStateFlow.setValue(SupportFeedbackState.copy$default(mutableStateFlow.getValue(), null, 0, null, null, false, false, null, 95, null));
    }

    public final String calculateTimestamp(Long timestamp) {
        if (timestamp == null) {
            return "";
        }
        String timeFromTimestamp = DateHelper.getTimeFromTimestamp(timestamp.longValue());
        Intrinsics.checkNotNullExpressionValue(timeFromTimestamp, "getTimeFromTimestamp(...)");
        return timeFromTimestamp;
    }

    public final void refreshSupportCategories() {
        Bundle bundle = new Bundle();
        bundle.putString("lang", Locale.getDefault().getLanguage());
        getGetSupportCategoriesInteractor().load(this.supportCategoriesListener, null, bundle);
    }

    public final void requestCreateTicket() {
        List<? extends SupportCategoryDto> list = this.supportCategories;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((SupportCategoryDto) next).getId();
            if (id != null && !StringsKt.isBlank(id)) {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            emitCreateTicketDialog(arrayList2);
        } else {
            this.pendingCreateTicketRequest = true;
            refreshSupportCategories();
        }
    }

    private final void emitCreateTicketDialog(List<? extends SupportCategoryDto> categories) {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new SupportController$emitCreateTicketDialog$1(this, categories, null), 3, null);
    }

    private final void dismissLegacyTicketDetail() {
        this.ticketMessagesContinuationToken = null;
        this.isTicketMessagesLoadingMore = false;
        this._ticketDetailState.setValue(new SupportTicketDetailState(null, 0L, null, false, false, false, false, false, null, null, 1023, null));
    }

    public final void createTicket(String details, String categoryId) {
        SupportCategoryDto supportCategoryDto;
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        if (StringsKt.isBlank(details)) {
            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new SupportController$createTicket$1(this, null), 3, null);
            return;
        }
        if (StringsKt.isBlank(categoryId) && ((supportCategoryDto = (SupportCategoryDto) CollectionsKt.firstOrNull((List) this.supportCategories)) == null || (categoryId = supportCategoryDto.getId()) == null)) {
            categoryId = LEGACY_DEFAULT_SUPPORT_CATEGORY_ID;
        }
        Bundle bundle = new Bundle();
        bundle.putString("chatName", deriveChatName(details, categoryId));
        bundle.putString("message", details);
        bundle.putString("categoryId", categoryId);
        getCreateSupportChatInteractor().load(this.createTicketListener, null, bundle);
    }

    private final String deriveChatName(String details, String categoryId) {
        Context context;
        Object obj;
        String str;
        String name;
        Iterator<T> it = this.supportCategories.iterator();
        while (true) {
            context = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((SupportCategoryDto) obj).getId(), categoryId)) {
                break;
            }
        }
        SupportCategoryDto supportCategoryDto = (SupportCategoryDto) obj;
        if (supportCategoryDto == null || (name = supportCategoryDto.getName()) == null || (str = StringsKt.trim((CharSequence) name).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String str2 = (String) SequencesKt.firstOrNull(StringsKt.lineSequence(details));
        String obj2 = str2 != null ? StringsKt.trim((CharSequence) str2).toString() : null;
        if (obj2 == null) {
            obj2 = "";
        }
        if (obj2.length() > 0) {
            return obj2.length() > 80 ? StringsKt.take(obj2, 80) : obj2;
        }
        Context context2 = this.appContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        } else {
            context = context2;
        }
        String string = context.getString(R.string.other);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final boolean isLegacyDefaultSupportChat(SupportChatDto chat) {
        return isLegacyDefaultSupportChatName(chat.getChatName());
    }

    private final boolean isLegacyDefaultSupportChatName(String chatName) {
        Context context = null;
        String obj = chatName != null ? StringsKt.trim((CharSequence) chatName).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (StringsKt.equals(obj, LEGACY_DEFAULT_SUPPORT_CHAT_NAME, true)) {
            return true;
        }
        Context context2 = this.appContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        } else {
            context = context2;
        }
        return StringsKt.equals(obj, context.getString(R.string.support_chat), true);
    }

    public final void openTicket(String chatId) {
        SupportTicketDetailState copy;
        SupportTicketDetailState copy2;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        if (StringsKt.isBlank(chatId)) {
            MutableStateFlow<SupportTicketDetailState> mutableStateFlow = this._ticketDetailState;
            copy2 = r5.copy((r24 & 1) != 0 ? r5.chatId : null, (r24 & 2) != 0 ? r5.openRequestId : 0L, (r24 & 4) != 0 ? r5.ticketTitle : null, (r24 & 8) != 0 ? r5.isLoading : false, (r24 & 16) != 0 ? r5.isLoadingMore : false, (r24 & 32) != 0 ? r5.hasMore : false, (r24 & 64) != 0 ? r5.isSending : false, (r24 & 128) != 0 ? r5.isActive : false, (r24 & 256) != 0 ? r5.messages : null, (r24 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
            mutableStateFlow.setValue(copy2);
            this.ticketMessagesContinuationToken = null;
            this.isTicketMessagesLoadingMore = false;
            return;
        }
        List<String> value = this._tabs.getValue();
        Context context = this.appContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context = null;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(value.indexOf(context.getString(R.string.support)), 0);
        if (this._selectedTab.getValue().intValue() != coerceAtLeast) {
            this._selectedTab.setValue(Integer.valueOf(coerceAtLeast));
        }
        this.ticketMessagesContinuationToken = null;
        this.isTicketMessagesLoadingMore = false;
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow2 = this._ticketDetailState;
        copy = r1.copy((r24 & 1) != 0 ? r1.chatId : chatId, (r24 & 2) != 0 ? r1.openRequestId : this._ticketDetailState.getValue().getOpenRequestId() + 1, (r24 & 4) != 0 ? r1.ticketTitle : null, (r24 & 8) != 0 ? r1.isLoading : true, (r24 & 16) != 0 ? r1.isLoadingMore : false, (r24 & 32) != 0 ? r1.hasMore : false, (r24 & 64) != 0 ? r1.isSending : false, (r24 & 128) != 0 ? r1.isActive : true, (r24 & 256) != 0 ? r1.messages : CollectionsKt.emptyList(), (r24 & 512) != 0 ? mutableStateFlow2.getValue().errorMessage : null);
        mutableStateFlow2.setValue(copy);
        refreshTicketDetails(chatId);
        refreshTicketMessages(chatId);
    }

    public final void refreshTicketDetails(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        getGetSupportChatInteractor().load(this.ticketDetailsListener, chatId, new Bundle());
    }

    public final void refreshTicketMessages(String chatId) {
        SupportTicketDetailState copy;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        boolean z = Intrinsics.areEqual(this._ticketDetailState.getValue().getChatId(), chatId) && !this._ticketDetailState.getValue().getMessages().isEmpty();
        this.ticketMessagesContinuationToken = null;
        this.isTicketMessagesLoadingMore = false;
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow = this._ticketDetailState;
        copy = r6.copy((r24 & 1) != 0 ? r6.chatId : null, (r24 & 2) != 0 ? r6.openRequestId : 0L, (r24 & 4) != 0 ? r6.ticketTitle : null, (r24 & 8) != 0 ? r6.isLoading : !z, (r24 & 16) != 0 ? r6.isLoadingMore : false, (r24 & 32) != 0 ? r6.hasMore : false, (r24 & 64) != 0 ? r6.isSending : false, (r24 & 128) != 0 ? r6.isActive : false, (r24 & 256) != 0 ? r6.messages : z ? this._ticketDetailState.getValue().getMessages() : CollectionsKt.emptyList(), (r24 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        Bundle bundle = new Bundle();
        bundle.putInt(VKAttachments.TYPE_WIKI_PAGE, 0);
        bundle.putInt(RRWebVideoEvent.JsonKeys.SIZE, 50);
        bundle.putString(VKApiConst.SORT, "sendDate,desc");
        getGetSupportChatMessagesInteractor().load(this.ticketMessagesListener, chatId, bundle);
    }

    public final void loadMoreTicketMessages(String chatId) {
        String str;
        SupportTicketDetailState copy;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        if (this.isTicketMessagesLoadingMore || (str = this.ticketMessagesContinuationToken) == null || str.length() == 0) {
            return;
        }
        this.isTicketMessagesLoadingMore = true;
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow = this._ticketDetailState;
        copy = r4.copy((r24 & 1) != 0 ? r4.chatId : null, (r24 & 2) != 0 ? r4.openRequestId : 0L, (r24 & 4) != 0 ? r4.ticketTitle : null, (r24 & 8) != 0 ? r4.isLoading : false, (r24 & 16) != 0 ? r4.isLoadingMore : true, (r24 & 32) != 0 ? r4.hasMore : false, (r24 & 64) != 0 ? r4.isSending : false, (r24 & 128) != 0 ? r4.isActive : false, (r24 & 256) != 0 ? r4.messages : null, (r24 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        Bundle bundle = new Bundle();
        bundle.putInt(VKAttachments.TYPE_WIKI_PAGE, 0);
        bundle.putInt(RRWebVideoEvent.JsonKeys.SIZE, 50);
        bundle.putString(VKApiConst.SORT, "sendDate,desc");
        bundle.putString("continuationToken", this.ticketMessagesContinuationToken);
        getGetSupportChatMessagesInteractor().load(this.ticketMessagesListener, chatId, bundle);
    }

    public final void sendTicketMessage(String chatId, String message) {
        SupportTicketDetailState copy;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(message, "message");
        if (StringsKt.isBlank(message) || this._ticketDetailState.getValue().isSending()) {
            return;
        }
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow = this._ticketDetailState;
        copy = r6.copy((r24 & 1) != 0 ? r6.chatId : null, (r24 & 2) != 0 ? r6.openRequestId : 0L, (r24 & 4) != 0 ? r6.ticketTitle : null, (r24 & 8) != 0 ? r6.isLoading : false, (r24 & 16) != 0 ? r6.isLoadingMore : false, (r24 & 32) != 0 ? r6.hasMore : false, (r24 & 64) != 0 ? r6.isSending : true, (r24 & 128) != 0 ? r6.isActive : false, (r24 & 256) != 0 ? r6.messages : null, (r24 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        getSendSupportChatMessageInteractor().load(this.sendTicketMessageListener, chatId, bundle);
    }

    public final void closeTicket(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        getCloseSupportChatInteractor().load(this.closeTicketListener, chatId, new Bundle());
    }

    public final List<SupportCategoryDto> getSupportCategories() {
        return this.supportCategories;
    }

    public final void refreshTicketList() {
        MutableStateFlow<SupportTicketListState> mutableStateFlow = this._ticketListState;
        mutableStateFlow.setValue(SupportTicketListState.copy$default(mutableStateFlow.getValue(), true, null, null, 2, null));
        Bundle bundle = new Bundle();
        bundle.putInt(VKAttachments.TYPE_WIKI_PAGE, 0);
        bundle.putInt(RRWebVideoEvent.JsonKeys.SIZE, 50);
        bundle.putString(VKApiConst.SORT, "lastMessageDate,desc");
        getGetSupportChatsInteractor().load(this.ticketListListener, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.time.LocalDateTime] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ticketListListener$lambda$32(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        String str2;
        Boolean read;
        MutableStateFlow<SupportTicketListState> mutableStateFlow = supportController._ticketListState;
        mutableStateFlow.setValue(SupportTicketListState.copy$default(mutableStateFlow.getValue(), false, null, null, 6, null));
        Context context = null;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            MutableStateFlow<SupportTicketListState> mutableStateFlow2 = supportController._ticketListState;
            SupportTicketListState value = mutableStateFlow2.getValue();
            Context context2 = supportController.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            mutableStateFlow2.setValue(SupportTicketListState.copy$default(value, false, null, context.getString(R.string.error), 3, null));
            return;
        }
        List content = ((PageModel) fetchedResponseMessage.getModel()).getContent();
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : content) {
            if (!supportController.isLegacyDefaultSupportChat((SupportChatDto) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<SupportChatDto> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (SupportChatDto supportChatDto : arrayList2) {
            String lastMessageDate = supportChatDto.getLastMessageDate();
            if (lastMessageDate != null) {
                try {
                    Instant parse = Instant.parse(lastMessageDate);
                    String timeFromTimestamp = DateHelper.getTimeFromTimestamp(parse.toEpochMilli());
                    ?? localDateTime = parse.atZone(ZoneId.systemDefault()).toLocalDateTime();
                    int dayOfMonth = localDateTime.getDayOfMonth();
                    String lowerCase = localDateTime.getMonth().name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(lowerCase.charAt(0));
                        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = valueOf.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        StringBuilder append = sb.append((Object) upperCase);
                        String substring = lowerCase.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        lowerCase = append.append(substring).toString();
                    }
                    str = timeFromTimestamp + " | " + dayOfMonth + " " + StringsKt.take(lowerCase, 3) + " " + localDateTime.getYear();
                } catch (Exception unused) {
                    str = "";
                }
                if (str != null) {
                    str2 = str;
                    read = supportChatDto.getRead();
                    if (read == null) {
                        read = supportChatDto.getIsRead();
                    }
                    boolean areEqual = Intrinsics.areEqual((Object) read, (Object) false);
                    String chatIdAsString = supportChatDto.getChatIdAsString();
                    Intrinsics.checkNotNullExpressionValue(chatIdAsString, "getChatIdAsString(...)");
                    String chatName = supportChatDto.getChatName();
                    arrayList3.add(new SupportTicketItem(chatIdAsString, chatName != null ? "" : chatName, str2, (!Intrinsics.areEqual((Object) supportChatDto.getActive(), (Object) true) || Intrinsics.areEqual((Object) supportChatDto.getIsActive(), (Object) true)) ? TicketStatus.ACTIVE : TicketStatus.CLOSED, areEqual, supportChatDto.getLastMessageText()));
                }
            }
            str2 = "";
            read = supportChatDto.getRead();
            if (read == null) {
            }
            boolean areEqual2 = Intrinsics.areEqual((Object) read, (Object) false);
            String chatIdAsString2 = supportChatDto.getChatIdAsString();
            Intrinsics.checkNotNullExpressionValue(chatIdAsString2, "getChatIdAsString(...)");
            String chatName2 = supportChatDto.getChatName();
            arrayList3.add(new SupportTicketItem(chatIdAsString2, chatName2 != null ? "" : chatName2, str2, (!Intrinsics.areEqual((Object) supportChatDto.getActive(), (Object) true) || Intrinsics.areEqual((Object) supportChatDto.getIsActive(), (Object) true)) ? TicketStatus.ACTIVE : TicketStatus.CLOSED, areEqual2, supportChatDto.getLastMessageText()));
        }
        MutableStateFlow<SupportTicketListState> mutableStateFlow3 = supportController._ticketListState;
        mutableStateFlow3.setValue(mutableStateFlow3.getValue().copy(false, arrayList3, null));
    }

    public final void refreshMyData() {
        MyDataState copy;
        MutableStateFlow<MyDataState> mutableStateFlow = this._myDataState;
        copy = r2.copy((r18 & 1) != 0 ? r2.isLoading : true, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : null, (r18 & 8) != 0 ? r2.message : null, (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : false, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
        getGetDeleteAccountInfoInteractor().load(this.myDataListener, null, new Bundle());
    }

    private final String getUserEmail() {
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            SupportController supportController = this;
            String email = getUserService().getShortProfile().getUserModel().getEmail();
            if (email == null) {
                email = "";
            }
            obj = Result.m10853constructorimpl(email);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m10859isFailureimpl(obj) ? "" : obj);
    }

    public final void updateMyDataEmail(String email) {
        MyDataState copy;
        Intrinsics.checkNotNullParameter(email, "email");
        MutableStateFlow<MyDataState> mutableStateFlow = this._myDataState;
        copy = r2.copy((r18 & 1) != 0 ? r2.isLoading : false, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : email, (r18 & 8) != 0 ? r2.message : null, (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : false, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
    }

    public final void updateMyDataMessage(String message) {
        MyDataState copy;
        Intrinsics.checkNotNullParameter(message, "message");
        MutableStateFlow<MyDataState> mutableStateFlow = this._myDataState;
        copy = r2.copy((r18 & 1) != 0 ? r2.isLoading : false, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : null, (r18 & 8) != 0 ? r2.message : message, (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : false, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
    }

    public final void deleteAccount() {
        MyDataState copy;
        MyDataState copy2;
        MyDataState copy3;
        MyDataState value = this._myDataState.getValue();
        Context context = null;
        if (StringsKt.isBlank(value.getEmail())) {
            MutableStateFlow<MyDataState> mutableStateFlow = this._myDataState;
            Context context2 = this.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            copy3 = value.copy((r18 & 1) != 0 ? value.isLoading : false, (r18 & 2) != 0 ? value.hasActiveRequest : false, (r18 & 4) != 0 ? value.email : null, (r18 & 8) != 0 ? value.message : null, (r18 & 16) != 0 ? value.isSending : false, (r18 & 32) != 0 ? value.isCancelling : false, (r18 & 64) != 0 ? value.errorMessage : context.getString(R.string.please_enter_email), (r18 & 128) != 0 ? value.isGuest : false);
            mutableStateFlow.setValue(copy3);
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(value.getEmail()).matches()) {
            MutableStateFlow<MyDataState> mutableStateFlow2 = this._myDataState;
            Context context3 = this.appContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context3;
            }
            copy2 = value.copy((r18 & 1) != 0 ? value.isLoading : false, (r18 & 2) != 0 ? value.hasActiveRequest : false, (r18 & 4) != 0 ? value.email : null, (r18 & 8) != 0 ? value.message : null, (r18 & 16) != 0 ? value.isSending : false, (r18 & 32) != 0 ? value.isCancelling : false, (r18 & 64) != 0 ? value.errorMessage : context.getString(R.string.invalid_email), (r18 & 128) != 0 ? value.isGuest : false);
            mutableStateFlow2.setValue(copy2);
            return;
        }
        MutableStateFlow<MyDataState> mutableStateFlow3 = this._myDataState;
        copy = value.copy((r18 & 1) != 0 ? value.isLoading : false, (r18 & 2) != 0 ? value.hasActiveRequest : false, (r18 & 4) != 0 ? value.email : null, (r18 & 8) != 0 ? value.message : null, (r18 & 16) != 0 ? value.isSending : true, (r18 & 32) != 0 ? value.isCancelling : false, (r18 & 64) != 0 ? value.errorMessage : null, (r18 & 128) != 0 ? value.isGuest : false);
        mutableStateFlow3.setValue(copy);
        Bundle bundle = new Bundle();
        bundle.putString("email", StringsKt.trim((CharSequence) value.getEmail()).toString());
        String obj = StringsKt.trim((CharSequence) value.getMessage()).toString();
        if (!StringsKt.isBlank(obj)) {
            bundle.putString("message", obj);
        }
        getSendDeleteAccountInteractor().load(this.deleteAccountListener, null, bundle);
    }

    public final void cancelDeletionRequest() {
        MyDataState copy;
        MutableStateFlow<MyDataState> mutableStateFlow = this._myDataState;
        copy = r2.copy((r18 & 1) != 0 ? r2.isLoading : false, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : null, (r18 & 8) != 0 ? r2.message : null, (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : true, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
        getCancelAccountDeletionRequestInteractor().load(this.cancelDeletionRequestListener, null, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r3 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void myDataListener$lambda$35(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        MyDataState copy;
        MyDataState copy2;
        String str;
        MyDataState copy3;
        MyDataState copy4;
        MutableStateFlow<MyDataState> mutableStateFlow = supportController._myDataState;
        copy = r3.copy((r18 & 1) != 0 ? r3.isLoading : false, (r18 & 2) != 0 ? r3.hasActiveRequest : false, (r18 & 4) != 0 ? r3.email : null, (r18 & 8) != 0 ? r3.message : null, (r18 & 16) != 0 ? r3.isSending : false, (r18 & 32) != 0 ? r3.isCancelling : false, (r18 & 64) != 0 ? r3.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            AccountDeletionRequest accountDeletionRequest = (AccountDeletionRequest) fetchedResponseMessage.getModel();
            String state = accountDeletionRequest.getState();
            if (state != null) {
                str = state.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            }
            str = "";
            if (Intrinsics.areEqual(str, "PROCESSING")) {
                MutableStateFlow<MyDataState> mutableStateFlow2 = supportController._myDataState;
                MyDataState value = mutableStateFlow2.getValue();
                String email = accountDeletionRequest.getEmail();
                String str2 = email == null ? "" : email;
                String message = accountDeletionRequest.getMessage();
                copy4 = value.copy((r18 & 1) != 0 ? value.isLoading : false, (r18 & 2) != 0 ? value.hasActiveRequest : true, (r18 & 4) != 0 ? value.email : str2, (r18 & 8) != 0 ? value.message : message == null ? "" : message, (r18 & 16) != 0 ? value.isSending : false, (r18 & 32) != 0 ? value.isCancelling : false, (r18 & 64) != 0 ? value.errorMessage : null, (r18 & 128) != 0 ? value.isGuest : false);
                mutableStateFlow2.setValue(copy4);
                BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$myDataListener$1$1(supportController, null), 3, null);
                return;
            }
            String userEmail = supportController.getUserEmail();
            MutableStateFlow<MyDataState> mutableStateFlow3 = supportController._myDataState;
            copy3 = r10.copy((r18 & 1) != 0 ? r10.isLoading : false, (r18 & 2) != 0 ? r10.hasActiveRequest : false, (r18 & 4) != 0 ? r10.email : userEmail, (r18 & 8) != 0 ? r10.message : "", (r18 & 16) != 0 ? r10.isSending : false, (r18 & 32) != 0 ? r10.isCancelling : false, (r18 & 64) != 0 ? r10.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow3.getValue().isGuest : false);
            mutableStateFlow3.setValue(copy3);
            return;
        }
        String userEmail2 = supportController.getUserEmail();
        MutableStateFlow<MyDataState> mutableStateFlow4 = supportController._myDataState;
        copy2 = r2.copy((r18 & 1) != 0 ? r2.isLoading : false, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : userEmail2, (r18 & 8) != 0 ? r2.message : "", (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : false, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow4.getValue().isGuest : false);
        mutableStateFlow4.setValue(copy2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r14 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void deleteAccountListener$lambda$36(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        MyDataState copy;
        String string;
        MyDataState copy2;
        String str;
        AccountDeletionRequest accountDeletionRequest;
        MutableStateFlow<MyDataState> mutableStateFlow = supportController._myDataState;
        copy = r2.copy((r18 & 1) != 0 ? r2.isLoading : false, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : null, (r18 & 8) != 0 ? r2.message : null, (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : false, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
        Context context = null;
        Log.d("SupportController", "Delete account response: stat=" + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) + ", model=" + (fetchedResponseMessage != null ? (AccountDeletionRequest) fetchedResponseMessage.getModel() : null) + ", state=" + ((fetchedResponseMessage == null || (accountDeletionRequest = (AccountDeletionRequest) fetchedResponseMessage.getModel()) == null) ? null : accountDeletionRequest.getState()));
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            String state = ((AccountDeletionRequest) fetchedResponseMessage.getModel()).getState();
            if (state != null) {
                str = state.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            }
            str = "";
            if (!Intrinsics.areEqual(str, "PROCESSING")) {
                Log.w("SupportController", "Unexpected state after creation: " + str);
                supportController.refreshMyData();
                return;
            } else {
                supportController.refreshMyData();
                return;
            }
        }
        FetchStat stat = fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null;
        int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$1[stat.ordinal()];
        if (i == 1) {
            supportController.refreshMyData();
            Context context2 = supportController.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            string = context.getString(R.string.there_is_another_request_for_this_email);
        } else if (i == 2) {
            Context context3 = supportController.appContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context3;
            }
            string = context.getString(R.string.error);
        } else if (i == 3) {
            Context context4 = supportController.appContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context4;
            }
            string = context.getString(R.string.conection_internet_failed);
        } else {
            Context context5 = supportController.appContext;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context5;
            }
            string = context.getString(R.string.error);
        }
        String str2 = string;
        Intrinsics.checkNotNull(str2);
        MutableStateFlow<MyDataState> mutableStateFlow2 = supportController._myDataState;
        copy2 = r0.copy((r18 & 1) != 0 ? r0.isLoading : false, (r18 & 2) != 0 ? r0.hasActiveRequest : false, (r18 & 4) != 0 ? r0.email : null, (r18 & 8) != 0 ? r0.message : null, (r18 & 16) != 0 ? r0.isSending : false, (r18 & 32) != 0 ? r0.isCancelling : false, (r18 & 64) != 0 ? r0.errorMessage : str2, (r18 & 128) != 0 ? mutableStateFlow2.getValue().isGuest : false);
        mutableStateFlow2.setValue(copy2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r14 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void cancelDeletionRequestListener$lambda$37(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        MyDataState copy;
        MyDataState copy2;
        String str;
        MyDataState copy3;
        MutableStateFlow<MyDataState> mutableStateFlow = supportController._myDataState;
        copy = r2.copy((r18 & 1) != 0 ? r2.isLoading : false, (r18 & 2) != 0 ? r2.hasActiveRequest : false, (r18 & 4) != 0 ? r2.email : null, (r18 & 8) != 0 ? r2.message : null, (r18 & 16) != 0 ? r2.isSending : false, (r18 & 32) != 0 ? r2.isCancelling : false, (r18 & 64) != 0 ? r2.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow.getValue().isGuest : false);
        mutableStateFlow.setValue(copy);
        Context context = null;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            String state = ((AccountDeletionRequest) fetchedResponseMessage.getModel()).getState();
            if (state != null) {
                str = state.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            }
            str = "";
            if (Intrinsics.areEqual(str, "CANCELED") || Intrinsics.areEqual(str, "CANCELLED")) {
                String userEmail = supportController.getUserEmail();
                MutableStateFlow<MyDataState> mutableStateFlow2 = supportController._myDataState;
                copy3 = r0.copy((r18 & 1) != 0 ? r0.isLoading : false, (r18 & 2) != 0 ? r0.hasActiveRequest : false, (r18 & 4) != 0 ? r0.email : userEmail, (r18 & 8) != 0 ? r0.message : "", (r18 & 16) != 0 ? r0.isSending : false, (r18 & 32) != 0 ? r0.isCancelling : false, (r18 & 64) != 0 ? r0.errorMessage : null, (r18 & 128) != 0 ? mutableStateFlow2.getValue().isGuest : false);
                mutableStateFlow2.setValue(copy3);
                supportController.refreshMyData();
                return;
            }
            supportController.refreshMyData();
            return;
        }
        supportController.refreshMyData();
        MutableStateFlow<MyDataState> mutableStateFlow3 = supportController._myDataState;
        MyDataState value = mutableStateFlow3.getValue();
        Context context2 = supportController.appContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        } else {
            context = context2;
        }
        copy2 = value.copy((r18 & 1) != 0 ? value.isLoading : false, (r18 & 2) != 0 ? value.hasActiveRequest : false, (r18 & 4) != 0 ? value.email : null, (r18 & 8) != 0 ? value.message : null, (r18 & 16) != 0 ? value.isSending : false, (r18 & 32) != 0 ? value.isCancelling : false, (r18 & 64) != 0 ? value.errorMessage : context.getString(R.string.error), (r18 & 128) != 0 ? value.isGuest : false);
        mutableStateFlow3.setValue(copy2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void supportCategoriesListener$lambda$39(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            Object model = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
            supportController.supportCategories = (List) model;
        }
        if (supportController.pendingCreateTicketRequest) {
            supportController.pendingCreateTicketRequest = false;
            List<? extends SupportCategoryDto> list = supportController.supportCategories;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String id = ((SupportCategoryDto) obj).getId();
                if (!(id == null || StringsKt.isBlank(id))) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$supportCategoriesListener$1$1(supportController, null), 3, null);
            } else {
                supportController.emitCreateTicketDialog(arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTicketListener$lambda$40(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        SupportTicketDetailState copy;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$createTicketListener$1$1(supportController, null), 3, null);
            return;
        }
        supportController.refreshTicketList();
        String chatIdAsString = ((SupportChatDto) fetchedResponseMessage.getModel()).getChatIdAsString();
        Intrinsics.checkNotNull(chatIdAsString);
        if (chatIdAsString.length() > 0) {
            Boolean active = ((SupportChatDto) fetchedResponseMessage.getModel()).getActive();
            boolean booleanValue = (active == null && (active = ((SupportChatDto) fetchedResponseMessage.getModel()).getIsActive()) == null) ? true : active.booleanValue();
            MutableStateFlow<SupportTicketDetailState> mutableStateFlow = supportController._ticketDetailState;
            SupportTicketDetailState value = mutableStateFlow.getValue();
            String chatName = ((SupportChatDto) fetchedResponseMessage.getModel()).getChatName();
            if (chatName == null) {
                chatName = "";
            }
            copy = value.copy((r24 & 1) != 0 ? value.chatId : chatIdAsString, (r24 & 2) != 0 ? value.openRequestId : 0L, (r24 & 4) != 0 ? value.ticketTitle : chatName, (r24 & 8) != 0 ? value.isLoading : false, (r24 & 16) != 0 ? value.isLoadingMore : false, (r24 & 32) != 0 ? value.hasMore : false, (r24 & 64) != 0 ? value.isSending : false, (r24 & 128) != 0 ? value.isActive : booleanValue, (r24 & 256) != 0 ? value.messages : null, (r24 & 512) != 0 ? value.errorMessage : null);
            mutableStateFlow.setValue(copy);
            supportController.refreshTicketDetails(chatIdAsString);
            supportController.refreshTicketMessages(chatIdAsString);
        }
        BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$createTicketListener$1$2(supportController, chatIdAsString, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailsListener$lambda$41(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        SupportTicketDetailState copy;
        SupportTicketDetailState copy2;
        Context context = null;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            Object model = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
            if (supportController.isLegacyDefaultSupportChat((SupportChatDto) model)) {
                supportController.dismissLegacyTicketDetail();
                supportController.refreshTicketList();
                BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$ticketDetailsListener$1$1(supportController, null), 3, null);
                return;
            }
            boolean z = true;
            if (!Intrinsics.areEqual((Object) ((SupportChatDto) fetchedResponseMessage.getModel()).getActive(), (Object) true) && !Intrinsics.areEqual((Object) ((SupportChatDto) fetchedResponseMessage.getModel()).getIsActive(), (Object) true)) {
                z = false;
            }
            boolean z2 = z;
            MutableStateFlow<SupportTicketDetailState> mutableStateFlow = supportController._ticketDetailState;
            SupportTicketDetailState value = mutableStateFlow.getValue();
            String chatName = ((SupportChatDto) fetchedResponseMessage.getModel()).getChatName();
            if (chatName == null) {
                chatName = "";
            }
            copy2 = value.copy((r24 & 1) != 0 ? value.chatId : null, (r24 & 2) != 0 ? value.openRequestId : 0L, (r24 & 4) != 0 ? value.ticketTitle : chatName, (r24 & 8) != 0 ? value.isLoading : false, (r24 & 16) != 0 ? value.isLoadingMore : false, (r24 & 32) != 0 ? value.hasMore : false, (r24 & 64) != 0 ? value.isSending : false, (r24 & 128) != 0 ? value.isActive : z2, (r24 & 256) != 0 ? value.messages : null, (r24 & 512) != 0 ? value.errorMessage : null);
            mutableStateFlow.setValue(copy2);
            return;
        }
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow2 = supportController._ticketDetailState;
        SupportTicketDetailState value2 = mutableStateFlow2.getValue();
        Context context2 = supportController.appContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        } else {
            context = context2;
        }
        copy = value2.copy((r24 & 1) != 0 ? value2.chatId : null, (r24 & 2) != 0 ? value2.openRequestId : 0L, (r24 & 4) != 0 ? value2.ticketTitle : null, (r24 & 8) != 0 ? value2.isLoading : false, (r24 & 16) != 0 ? value2.isLoadingMore : false, (r24 & 32) != 0 ? value2.hasMore : false, (r24 & 64) != 0 ? value2.isSending : false, (r24 & 128) != 0 ? value2.isActive : false, (r24 & 256) != 0 ? value2.messages : null, (r24 & 512) != 0 ? value2.errorMessage : context.getString(R.string.error));
        mutableStateFlow2.setValue(copy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ticketMessagesListener$lambda$47(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        SupportTicketDetailState copy;
        SupportTicketDetailState copy2;
        Object m10853constructorimpl;
        SupportTicketDetailState copy3;
        String str;
        String str2;
        MessageBubbleUi messageBubbleUi;
        Long id;
        String name;
        Long id2;
        supportController.isTicketMessagesLoadingMore = false;
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow = supportController._ticketDetailState;
        copy = r4.copy((r24 & 1) != 0 ? r4.chatId : null, (r24 & 2) != 0 ? r4.openRequestId : 0L, (r24 & 4) != 0 ? r4.ticketTitle : null, (r24 & 8) != 0 ? r4.isLoading : false, (r24 & 16) != 0 ? r4.isLoadingMore : false, (r24 & 32) != 0 ? r4.hasMore : false, (r24 & 64) != 0 ? r4.isSending : false, (r24 & 128) != 0 ? r4.isActive : false, (r24 & 256) != 0 ? r4.messages : null, (r24 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        Context context = null;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            MutableStateFlow<SupportTicketDetailState> mutableStateFlow2 = supportController._ticketDetailState;
            SupportTicketDetailState value = mutableStateFlow2.getValue();
            Context context2 = supportController.appContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context = context2;
            }
            copy2 = value.copy((r24 & 1) != 0 ? value.chatId : null, (r24 & 2) != 0 ? value.openRequestId : 0L, (r24 & 4) != 0 ? value.ticketTitle : null, (r24 & 8) != 0 ? value.isLoading : false, (r24 & 16) != 0 ? value.isLoadingMore : false, (r24 & 32) != 0 ? value.hasMore : false, (r24 & 64) != 0 ? value.isSending : false, (r24 & 128) != 0 ? value.isActive : false, (r24 & 256) != 0 ? value.messages : null, (r24 & 512) != 0 ? value.errorMessage : context.getString(R.string.error));
            mutableStateFlow2.setValue(copy2);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(supportController.getUserService().getShortProfile().getUserModel().getId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = -1;
        }
        Integer num = (Integer) m10853constructorimpl;
        List content = ((PageModel) fetchedResponseMessage.getModel()).getContent();
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = content.iterator();
        while (it.hasNext()) {
            MessageExposeDto message = ((MessageWithReactionsDto) it.next()).getMessage();
            if (message == null) {
                messageBubbleUi = null;
            } else {
                String message2 = message.getMessage();
                String str3 = message2 == null ? "" : message2;
                V7SupportMessageUserDto user = message.getUser();
                String sendDate = message.getSendDate();
                if (sendDate != null) {
                    try {
                        str = DateHelper.getTimeFromTimestamp(Instant.parse(sendDate).toEpochMilli());
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str != null) {
                        str2 = str;
                        Integer id3 = message.getId();
                        messageBubbleUi = new MessageBubbleUi(String.valueOf(id3 == null ? id3.intValue() : 0), (user != null || (id2 = user.getId()) == null) ? -1 : (int) id2.longValue(), (user != null || (name = user.getName()) == null) ? "" : name, user == null ? user.getAvatarUrl() : null, str3, str2, num != null && ((user != null || (id = user.getId()) == null) ? -1 : (int) id.longValue()) == num.intValue());
                    }
                }
                str2 = "";
                Integer id32 = message.getId();
                if (num != null) {
                    messageBubbleUi = new MessageBubbleUi(String.valueOf(id32 == null ? id32.intValue() : 0), (user != null || (id2 = user.getId()) == null) ? -1 : (int) id2.longValue(), (user != null || (name = user.getName()) == null) ? "" : name, user == null ? user.getAvatarUrl() : null, str3, str2, num != null && ((user != null || (id = user.getId()) == null) ? -1 : (int) id.longValue()) == num.intValue());
                }
                messageBubbleUi = new MessageBubbleUi(String.valueOf(id32 == null ? id32.intValue() : 0), (user != null || (id2 = user.getId()) == null) ? -1 : (int) id2.longValue(), (user != null || (name = user.getName()) == null) ? "" : name, user == null ? user.getAvatarUrl() : null, str3, str2, num != null && ((user != null || (id = user.getId()) == null) ? -1 : (int) id.longValue()) == num.intValue());
            }
            if (messageBubbleUi != null) {
                arrayList.add(messageBubbleUi);
            }
        }
        ArrayList arrayList2 = arrayList;
        PageOptions pageOptions = ((PageModel) fetchedResponseMessage.getModel()).getPageOptions();
        String continuationToken = pageOptions != null ? pageOptions.getContinuationToken() : null;
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow3 = supportController._ticketDetailState;
        if (supportController.ticketMessagesContinuationToken == null || !supportController.isTicketMessagesLoadingMore) {
            String str4 = continuationToken;
            copy3 = r4.copy((r24 & 1) != 0 ? r4.chatId : null, (r24 & 2) != 0 ? r4.openRequestId : 0L, (r24 & 4) != 0 ? r4.ticketTitle : null, (r24 & 8) != 0 ? r4.isLoading : false, (r24 & 16) != 0 ? r4.isLoadingMore : false, (r24 & 32) != 0 ? r4.hasMore : !(str4 == null || str4.length() == 0), (r24 & 64) != 0 ? r4.isSending : false, (r24 & 128) != 0 ? r4.isActive : false, (r24 & 256) != 0 ? r4.messages : arrayList2, (r24 & 512) != 0 ? mutableStateFlow3.getValue().errorMessage : null);
        } else {
            List<MessageBubbleUi> messages = mutableStateFlow3.getValue().getMessages();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
            Iterator<T> it2 = messages.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((MessageBubbleUi) it2.next()).getId());
            }
            Set set = CollectionsKt.toSet(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!set.contains(((MessageBubbleUi) obj).getId())) {
                    arrayList4.add(obj);
                }
            }
            String str5 = continuationToken;
            copy3 = r9.copy((r24 & 1) != 0 ? r9.chatId : null, (r24 & 2) != 0 ? r9.openRequestId : 0L, (r24 & 4) != 0 ? r9.ticketTitle : null, (r24 & 8) != 0 ? r9.isLoading : false, (r24 & 16) != 0 ? r9.isLoadingMore : false, (r24 & 32) != 0 ? r9.hasMore : !(str5 == null || str5.length() == 0), (r24 & 64) != 0 ? r9.isSending : false, (r24 & 128) != 0 ? r9.isActive : false, (r24 & 256) != 0 ? r9.messages : CollectionsKt.plus((Collection) supportController._ticketDetailState.getValue().getMessages(), (Iterable) arrayList4), (r24 & 512) != 0 ? supportController._ticketDetailState.getValue().errorMessage : null);
        }
        mutableStateFlow3.setValue(copy3);
        supportController.ticketMessagesContinuationToken = continuationToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void sendTicketMessageListener$lambda$50(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        SupportTicketDetailState copy;
        Object m10853constructorimpl;
        String str;
        String str2;
        V7SupportMessageUserDto user;
        SupportTicketDetailState copy2;
        Long id;
        String name;
        Long id2;
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow = supportController._ticketDetailState;
        copy = r3.copy((r24 & 1) != 0 ? r3.chatId : null, (r24 & 2) != 0 ? r3.openRequestId : 0L, (r24 & 4) != 0 ? r3.ticketTitle : null, (r24 & 8) != 0 ? r3.isLoading : false, (r24 & 16) != 0 ? r3.isLoadingMore : false, (r24 & 32) != 0 ? r3.hasMore : false, (r24 & 64) != 0 ? r3.isSending : false, (r24 & 128) != 0 ? r3.isActive : false, (r24 & 256) != 0 ? r3.messages : null, (r24 & 512) != 0 ? mutableStateFlow.getValue().errorMessage : null);
        mutableStateFlow.setValue(copy);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$sendTicketMessageListener$1$1(supportController, null), 3, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(supportController.getUserService().getShortProfile().getUserModel().getId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        int i = -1;
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = -1;
        }
        Integer num = (Integer) m10853constructorimpl;
        MessageExposeDto messageExposeDto = (MessageExposeDto) fetchedResponseMessage.getModel();
        String sendDate = messageExposeDto.getSendDate();
        if (sendDate != null) {
            try {
                str = DateHelper.getTimeFromTimestamp(Instant.parse(sendDate).toEpochMilli());
            } catch (Exception unused) {
                str = "";
            }
            if (str != null) {
                str2 = str;
                Integer id3 = messageExposeDto.getId();
                String valueOf = String.valueOf(id3 == null ? id3.intValue() : 0);
                V7SupportMessageUserDto user2 = messageExposeDto.getUser();
                int longValue = (user2 != null || (id2 = user2.getId()) == null) ? -1 : (int) id2.longValue();
                V7SupportMessageUserDto user3 = messageExposeDto.getUser();
                String str3 = (user3 != null || (name = user3.getName()) == null) ? "" : name;
                V7SupportMessageUserDto user4 = messageExposeDto.getUser();
                String avatarUrl = user4 != null ? user4.getAvatarUrl() : null;
                String message = messageExposeDto.getMessage();
                String str4 = message != null ? "" : message;
                user = messageExposeDto.getUser();
                if (user != null && (id = user.getId()) != null) {
                    i = (int) id.longValue();
                }
                MessageBubbleUi messageBubbleUi = new MessageBubbleUi(valueOf, longValue, str3, avatarUrl, str4, str2, num != null && i == num.intValue());
                MutableStateFlow<SupportTicketDetailState> mutableStateFlow2 = supportController._ticketDetailState;
                copy2 = r6.copy((r24 & 1) != 0 ? r6.chatId : null, (r24 & 2) != 0 ? r6.openRequestId : 0L, (r24 & 4) != 0 ? r6.ticketTitle : null, (r24 & 8) != 0 ? r6.isLoading : false, (r24 & 16) != 0 ? r6.isLoadingMore : false, (r24 & 32) != 0 ? r6.hasMore : false, (r24 & 64) != 0 ? r6.isSending : false, (r24 & 128) != 0 ? r6.isActive : false, (r24 & 256) != 0 ? r6.messages : CollectionsKt.plus((Collection) CollectionsKt.listOf(messageBubbleUi), (Iterable) supportController._ticketDetailState.getValue().getMessages()), (r24 & 512) != 0 ? mutableStateFlow2.getValue().errorMessage : null);
                mutableStateFlow2.setValue(copy2);
                supportController.refreshTicketList();
            }
        }
        str2 = "";
        Integer id32 = messageExposeDto.getId();
        String valueOf2 = String.valueOf(id32 == null ? id32.intValue() : 0);
        V7SupportMessageUserDto user22 = messageExposeDto.getUser();
        if (user22 != null) {
        }
        V7SupportMessageUserDto user32 = messageExposeDto.getUser();
        if (user32 != null) {
        }
        V7SupportMessageUserDto user42 = messageExposeDto.getUser();
        if (user42 != null) {
        }
        String message2 = messageExposeDto.getMessage();
        if (message2 != null) {
        }
        user = messageExposeDto.getUser();
        if (user != null) {
            i = (int) id.longValue();
        }
        if (num != null) {
            MessageBubbleUi messageBubbleUi2 = new MessageBubbleUi(valueOf2, longValue, str3, avatarUrl, str4, str2, num != null && i == num.intValue());
            MutableStateFlow<SupportTicketDetailState> mutableStateFlow22 = supportController._ticketDetailState;
            copy2 = r6.copy((r24 & 1) != 0 ? r6.chatId : null, (r24 & 2) != 0 ? r6.openRequestId : 0L, (r24 & 4) != 0 ? r6.ticketTitle : null, (r24 & 8) != 0 ? r6.isLoading : false, (r24 & 16) != 0 ? r6.isLoadingMore : false, (r24 & 32) != 0 ? r6.hasMore : false, (r24 & 64) != 0 ? r6.isSending : false, (r24 & 128) != 0 ? r6.isActive : false, (r24 & 256) != 0 ? r6.messages : CollectionsKt.plus((Collection) CollectionsKt.listOf(messageBubbleUi2), (Iterable) supportController._ticketDetailState.getValue().getMessages()), (r24 & 512) != 0 ? mutableStateFlow22.getValue().errorMessage : null);
            mutableStateFlow22.setValue(copy2);
            supportController.refreshTicketList();
        }
        MessageBubbleUi messageBubbleUi22 = new MessageBubbleUi(valueOf2, longValue, str3, avatarUrl, str4, str2, num != null && i == num.intValue());
        MutableStateFlow<SupportTicketDetailState> mutableStateFlow222 = supportController._ticketDetailState;
        copy2 = r6.copy((r24 & 1) != 0 ? r6.chatId : null, (r24 & 2) != 0 ? r6.openRequestId : 0L, (r24 & 4) != 0 ? r6.ticketTitle : null, (r24 & 8) != 0 ? r6.isLoading : false, (r24 & 16) != 0 ? r6.isLoadingMore : false, (r24 & 32) != 0 ? r6.hasMore : false, (r24 & 64) != 0 ? r6.isSending : false, (r24 & 128) != 0 ? r6.isActive : false, (r24 & 256) != 0 ? r6.messages : CollectionsKt.plus((Collection) CollectionsKt.listOf(messageBubbleUi22), (Iterable) supportController._ticketDetailState.getValue().getMessages()), (r24 & 512) != 0 ? mutableStateFlow222.getValue().errorMessage : null);
        mutableStateFlow222.setValue(copy2);
        supportController.refreshTicketList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeTicketListener$lambda$51(SupportController supportController, FetchedResponseMessage fetchedResponseMessage) {
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$closeTicketListener$1$2(supportController, null), 3, null);
        } else {
            supportController.refreshTicketList();
            BuildersKt__Builders_commonKt.launch$default(supportController.controllerScope, null, null, new SupportController$closeTicketListener$1$1(supportController, fetchedResponseMessage, null), 3, null);
        }
    }
}
