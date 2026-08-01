package io.ktor.client.plugins.sse;

import com.ironsource.Te;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.URLParserKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: builders.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0013\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0083\u0001\u0010\u0013\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001a[\u0010\u0013\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\u001az\u0010%\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b#\u0010$\u001a¬\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b&\u0010'\u001a\u0084\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b(\u0010)\u001aQ\u0010+\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b*\u0010\u0012\u001a\u0083\u0001\u0010+\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b,\u0010\u001b\u001a[\u0010+\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b-\u0010\u001e\u001az\u0010/\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b.\u0010$\u001a¬\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b0\u00101\u001a\u0084\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b2\u00103\u001am\u0010\u0013\u001a\u000206*\u00020\b2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001d\u00107\u001a\u009f\u0001\u0010\u0013\u001a\u000206*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b8\u00109\u001aw\u0010\u0013\u001a\u000206*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b:\u0010;\u001a\u0096\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b<\u0010=\u001aÈ\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b>\u0010?\u001a \u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b@\u0010A\u001am\u0010+\u001a\u000206*\u00020\b2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b-\u00107\u001a\u009f\u0001\u0010+\u001a\u000206*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bB\u00109\u001aw\u0010+\u001a\u000206*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bC\u0010;\u001a\u0096\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b2\u0010=\u001aÈ\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bF\u0010G\u001al\u0010L\u001a\u00028\u0000\"\u0006\b\u0000\u0010H\u0018\u0001*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010I\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0082H¢\u0006\u0004\bJ\u0010K\u001a5\u0010P\u001a\u00020\u0003\"\b\b\u0000\u0010H*\u00020\"*\u00020\u000e2\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M2\b\u0010O\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\bP\u0010Q\u001a!\u0010V\u001a\u00020T2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010W\" \u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\" \u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[\" \u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\" \u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[\"4\u0010b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010[¨\u0006d"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/sse/SSEConfig;", "", "Lkotlin/ExtensionFunctionType;", "config", "SSE", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lkotlin/time/Duration;", "reconnectionTime", "", "showCommentEvents", "showRetryEvents", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/sse/ClientSSESession;", "serverSentEventsSession-i8z2VEo", "(Lio/ktor/client/HttpClient;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession", "", "scheme", "host", "", "port", "path", "serverSentEventsSession-xEWcMm4", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "serverSentEventsSession-mY9Nd3A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "serverSentEvents-mY9Nd3A", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents", "serverSentEvents-1wIb-0I", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-3bFjkrY", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sseSession-i8z2VEo", "sseSession", "sseSession-xEWcMm4", "sseSession-mY9Nd3A", "sse-mY9Nd3A", "sse", "sse-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "deserialize", "Lio/ktor/client/plugins/sse/ClientSSESessionWithDeserialization;", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-Mswn-_c", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-BqdlHlk", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-pTj2aPc", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sseSession-tL6_L-A", "sseSession-Mswn-_c", "sse-BAHpl2s", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse-Q9yt8Vw", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "additionalAttributes", "processSession-rp2poPw", "(Lio/ktor/client/HttpClient;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processSession", "Lio/ktor/util/AttributeKey;", "attributeKey", "value", "addAttribute", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/client/statement/HttpResponse;", Te.n, "", "cause", "mapToSSEException", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sseRequestAttr", "Lio/ktor/util/AttributeKey;", "getSseRequestAttr", "()Lio/ktor/util/AttributeKey;", "reconnectionTimeAttr", "getReconnectionTimeAttr", "showCommentEventsAttr", "getShowCommentEventsAttr", "showRetryEventsAttr", "getShowRetryEventsAttr", "deserializerAttr", "getDeserializerAttr", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildersKt {
    private static final AttributeKey<Function2<TypeInfo, String, Object>> deserializerAttr;
    private static final AttributeKey<Duration> reconnectionTimeAttr;
    private static final AttributeKey<Boolean> showCommentEventsAttr;
    private static final AttributeKey<Boolean> showRetryEventsAttr;
    private static final AttributeKey<Boolean> sseRequestAttr;

    public static final AttributeKey<Boolean> getSseRequestAttr() {
        return sseRequestAttr;
    }

    public static final AttributeKey<Duration> getReconnectionTimeAttr() {
        return reconnectionTimeAttr;
    }

    public static final AttributeKey<Boolean> getShowCommentEventsAttr() {
        return showCommentEventsAttr;
    }

    public static final AttributeKey<Boolean> getShowRetryEventsAttr() {
        return showRetryEventsAttr;
    }

    public static final AttributeKey<Function2<TypeInfo, String, Object>> getDeserializerAttr() {
        return deserializerAttr;
    }

    public static final void SSE(HttpClientConfig<?> httpClientConfig, final Function1<? super SSEConfig, Unit> config) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(SSEKt.getSSE(), new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit SSE$lambda$0;
                SSE$lambda$0 = BuildersKt.SSE$lambda$0(Function1.this, (SSEConfig) obj);
                return SSE$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SSE$lambda$0(Function1 function1, SSEConfig install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_xEWcMm4$lambda$2(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-xEWcMm4, reason: not valid java name */
    public static final Object m7925serverSentEventsSessionxEWcMm4(HttpClient httpClient, final String str, final String str2, final Integer num, final String str3, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESession> continuation) {
        return m7917serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEventsSession_xEWcMm4$lambda$3;
                serverSentEventsSession_xEWcMm4$lambda$3 = BuildersKt.serverSentEventsSession_xEWcMm4$lambda$3(str, str2, num, str3, function1, (HttpRequestBuilder) obj);
                return serverSentEventsSession_xEWcMm4$lambda$3;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_xEWcMm4$lambda$3(String str, String str2, Integer num, String str3, Function1 function1, HttpRequestBuilder serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        HttpRequestKt.url$default(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEventsSession);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_mY9Nd3A$lambda$4(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final Object m7919serverSentEventsSessionmY9Nd3A(HttpClient httpClient, final String str, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESession> continuation) {
        return m7917serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEventsSession_mY9Nd3A$lambda$5;
                serverSentEventsSession_mY9Nd3A$lambda$5 = BuildersKt.serverSentEventsSession_mY9Nd3A$lambda$5(str, function1, (HttpRequestBuilder) obj);
                return serverSentEventsSession_mY9Nd3A$lambda$5;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_mY9Nd3A$lambda$5(String str, Function1 function1, HttpRequestBuilder serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        URLParserKt.takeFrom(serverSentEventsSession.getUrl(), str);
        function1.invoke(serverSentEventsSession);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: serverSentEvents-mY9Nd3A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7911serverSentEventsmY9Nd3A(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        BuildersKt$serverSentEvents$1 buildersKt$serverSentEvents$1;
        Object coroutine_suspended;
        int i;
        Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function22;
        Object m7917serverSentEventsSessioni8z2VEo;
        ClientSSESession clientSSESession;
        ClientSSESession clientSSESession2;
        try {
            try {
                if (continuation instanceof BuildersKt$serverSentEvents$1) {
                    BuildersKt$serverSentEvents$1 buildersKt$serverSentEvents$12 = (BuildersKt$serverSentEvents$1) continuation;
                    if ((buildersKt$serverSentEvents$12.label & Integer.MIN_VALUE) != 0) {
                        buildersKt$serverSentEvents$12.label -= Integer.MIN_VALUE;
                        buildersKt$serverSentEvents$1 = buildersKt$serverSentEvents$12;
                        Object obj = buildersKt$serverSentEvents$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = buildersKt$serverSentEvents$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            function22 = function2;
                            buildersKt$serverSentEvents$1.L$0 = function22;
                            buildersKt$serverSentEvents$1.label = 1;
                            m7917serverSentEventsSessioni8z2VEo = m7917serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, function1, buildersKt$serverSentEvents$1);
                            if (m7917serverSentEventsSessioni8z2VEo == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                clientSSESession2 = (ClientSSESession) buildersKt$serverSentEvents$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    CoroutineScopeKt.cancel$default(clientSSESession2, null, 1, null);
                                    return Unit.INSTANCE;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    throw mapToSSEException(clientSSESession2.getCall().getResponse(), th);
                                }
                            }
                            Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function23 = (Function2) buildersKt$serverSentEvents$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            m7917serverSentEventsSessioni8z2VEo = obj;
                            function22 = function23;
                        }
                        clientSSESession = (ClientSSESession) m7917serverSentEventsSessioni8z2VEo;
                        buildersKt$serverSentEvents$1.L$0 = clientSSESession;
                        buildersKt$serverSentEvents$1.label = 2;
                        if (function22.invoke(clientSSESession, buildersKt$serverSentEvents$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        clientSSESession2 = clientSSESession;
                        CoroutineScopeKt.cancel$default(clientSSESession2, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }
                buildersKt$serverSentEvents$1.L$0 = clientSSESession;
                buildersKt$serverSentEvents$1.label = 2;
                if (function22.invoke(clientSSESession, buildersKt$serverSentEvents$1) != coroutine_suspended) {
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                clientSSESession2 = clientSSESession;
                throw mapToSSEException(clientSSESession2.getCall().getResponse(), th);
            }
            if (i != 0) {
            }
            clientSSESession = (ClientSSESession) m7917serverSentEventsSessioni8z2VEo;
        } catch (Throwable th3) {
            CoroutineScopeKt.cancel$default((CoroutineScope) buildersKt$serverSentEvents$1, null, 1, null);
            throw th3;
        }
        buildersKt$serverSentEvents$1 = new BuildersKt$serverSentEvents$1(continuation);
        Object obj2 = buildersKt$serverSentEvents$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$serverSentEvents$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_1wIb_0I$lambda$6(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-1wIb-0I, reason: not valid java name */
    public static final Object m7903serverSentEvents1wIb0I(HttpClient httpClient, final String str, final String str2, final Integer num, final String str3, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object m7911serverSentEventsmY9Nd3A = m7911serverSentEventsmY9Nd3A(httpClient, new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEvents_1wIb_0I$lambda$7;
                serverSentEvents_1wIb_0I$lambda$7 = BuildersKt.serverSentEvents_1wIb_0I$lambda$7(str, str2, num, str3, function1, (HttpRequestBuilder) obj);
                return serverSentEvents_1wIb_0I$lambda$7;
            }
        }, duration, bool, bool2, function2, continuation);
        return m7911serverSentEventsmY9Nd3A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7911serverSentEventsmY9Nd3A : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_1wIb_0I$lambda$7(String str, String str2, Integer num, String str3, Function1 function1, HttpRequestBuilder serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        HttpRequestKt.url$default(serverSentEvents, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEvents);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_3bFjkrY$lambda$8(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-3bFjkrY, reason: not valid java name */
    public static final Object m7905serverSentEvents3bFjkrY(HttpClient httpClient, final String str, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object m7911serverSentEventsmY9Nd3A = m7911serverSentEventsmY9Nd3A(httpClient, new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEvents_3bFjkrY$lambda$9;
                serverSentEvents_3bFjkrY$lambda$9 = BuildersKt.serverSentEvents_3bFjkrY$lambda$9(str, function1, (HttpRequestBuilder) obj);
                return serverSentEvents_3bFjkrY$lambda$9;
            }
        }, duration, bool, bool2, function2, continuation);
        return m7911serverSentEventsmY9Nd3A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7911serverSentEventsmY9Nd3A : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_3bFjkrY$lambda$9(String str, Function1 function1, HttpRequestBuilder serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        URLParserKt.takeFrom(serverSentEvents.getUrl(), str);
        function1.invoke(serverSentEvents);
        return Unit.INSTANCE;
    }

    /* renamed from: sseSession-i8z2VEo, reason: not valid java name */
    public static final Object m7941sseSessioni8z2VEo(HttpClient httpClient, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESession> continuation) {
        return m7917serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sseSession_xEWcMm4$lambda$10(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sseSession-xEWcMm4, reason: not valid java name */
    public static final Object m7949sseSessionxEWcMm4(HttpClient httpClient, String str, String str2, Integer num, String str3, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESession> continuation) {
        return m7925serverSentEventsSessionxEWcMm4(httpClient, str, str2, num, str3, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sseSession_mY9Nd3A$lambda$11(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final Object m7943sseSessionmY9Nd3A(HttpClient httpClient, String str, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESession> continuation) {
        return m7919serverSentEventsSessionmY9Nd3A(httpClient, str, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sse-mY9Nd3A, reason: not valid java name */
    public static final Object m7935ssemY9Nd3A(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object m7911serverSentEventsmY9Nd3A = m7911serverSentEventsmY9Nd3A(httpClient, function1, duration, bool, bool2, function2, continuation);
        return m7911serverSentEventsmY9Nd3A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7911serverSentEventsmY9Nd3A : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sse_tL6_L_A$lambda$12(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sse-tL6_L-A, reason: not valid java name */
    public static final Object m7937ssetL6_LA(HttpClient httpClient, String str, String str2, Integer num, String str3, Function1<? super HttpRequestBuilder, Unit> function1, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object m7903serverSentEvents1wIb0I = m7903serverSentEvents1wIb0I(httpClient, str, str2, num, str3, duration, bool, bool2, function1, function2, continuation);
        return m7903serverSentEvents1wIb0I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7903serverSentEvents1wIb0I : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sse_Mswn__c$lambda$13(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final Object m7929sseMswn_c(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object m7905serverSentEvents3bFjkrY = m7905serverSentEvents3bFjkrY(httpClient, str, duration, bool, bool2, function1, function2, continuation);
        return m7905serverSentEvents3bFjkrY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7905serverSentEvents3bFjkrY : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_tL6_L_A$lambda$15(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-tL6_L-A, reason: not valid java name */
    public static final Object m7923serverSentEventsSessiontL6_LA(HttpClient httpClient, final String str, final String str2, final Integer num, final String str3, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESessionWithDeserialization> continuation) {
        return m7920serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, (Function1<? super HttpRequestBuilder, Unit>) new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEventsSession_tL6_L_A$lambda$16;
                serverSentEventsSession_tL6_L_A$lambda$16 = BuildersKt.serverSentEventsSession_tL6_L_A$lambda$16(str, str2, num, str3, function1, (HttpRequestBuilder) obj);
                return serverSentEventsSession_tL6_L_A$lambda$16;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_tL6_L_A$lambda$16(String str, String str2, Integer num, String str3, Function1 function1, HttpRequestBuilder serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        HttpRequestKt.url$default(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEventsSession);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_Mswn__c$lambda$17(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-Mswn-_c, reason: not valid java name */
    public static final Object m7915serverSentEventsSessionMswn_c(HttpClient httpClient, final String str, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESessionWithDeserialization> continuation) {
        return m7920serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, (Function1<? super HttpRequestBuilder, Unit>) new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEventsSession_Mswn__c$lambda$18;
                serverSentEventsSession_Mswn__c$lambda$18 = BuildersKt.serverSentEventsSession_Mswn__c$lambda$18(str, function1, (HttpRequestBuilder) obj);
                return serverSentEventsSession_Mswn__c$lambda$18;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEventsSession_Mswn__c$lambda$18(String str, Function1 function1, HttpRequestBuilder serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        URLParserKt.takeFrom(serverSentEventsSession.getUrl(), str);
        function1.invoke(serverSentEventsSession);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: serverSentEvents-Mswn-_c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7909serverSentEventsMswn_c(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        BuildersKt$serverSentEvents$8 buildersKt$serverSentEvents$8;
        Object coroutine_suspended;
        int i;
        Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function23;
        Object m7920serverSentEventsSessionmY9Nd3A;
        ClientSSESessionWithDeserialization clientSSESessionWithDeserialization;
        ClientSSESessionWithDeserialization clientSSESessionWithDeserialization2;
        try {
            try {
                if (continuation instanceof BuildersKt$serverSentEvents$8) {
                    BuildersKt$serverSentEvents$8 buildersKt$serverSentEvents$82 = (BuildersKt$serverSentEvents$8) continuation;
                    if ((buildersKt$serverSentEvents$82.label & Integer.MIN_VALUE) != 0) {
                        buildersKt$serverSentEvents$82.label -= Integer.MIN_VALUE;
                        buildersKt$serverSentEvents$8 = buildersKt$serverSentEvents$82;
                        Object obj = buildersKt$serverSentEvents$8.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = buildersKt$serverSentEvents$8.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            function23 = function22;
                            buildersKt$serverSentEvents$8.L$0 = function23;
                            buildersKt$serverSentEvents$8.label = 1;
                            m7920serverSentEventsSessionmY9Nd3A = m7920serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, function1, buildersKt$serverSentEvents$8);
                            if (m7920serverSentEventsSessionmY9Nd3A == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                clientSSESessionWithDeserialization2 = (ClientSSESessionWithDeserialization) buildersKt$serverSentEvents$8.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    CoroutineScopeKt.cancel$default(clientSSESessionWithDeserialization2, null, 1, null);
                                    return Unit.INSTANCE;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    throw mapToSSEException(clientSSESessionWithDeserialization2.getCall().getResponse(), th);
                                }
                            }
                            Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function24 = (Function2) buildersKt$serverSentEvents$8.L$0;
                            ResultKt.throwOnFailure(obj);
                            m7920serverSentEventsSessionmY9Nd3A = obj;
                            function23 = function24;
                        }
                        clientSSESessionWithDeserialization = (ClientSSESessionWithDeserialization) m7920serverSentEventsSessionmY9Nd3A;
                        buildersKt$serverSentEvents$8.L$0 = clientSSESessionWithDeserialization;
                        buildersKt$serverSentEvents$8.label = 2;
                        if (function23.invoke(clientSSESessionWithDeserialization, buildersKt$serverSentEvents$8) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        clientSSESessionWithDeserialization2 = clientSSESessionWithDeserialization;
                        CoroutineScopeKt.cancel$default(clientSSESessionWithDeserialization2, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }
                buildersKt$serverSentEvents$8.L$0 = clientSSESessionWithDeserialization;
                buildersKt$serverSentEvents$8.label = 2;
                if (function23.invoke(clientSSESessionWithDeserialization, buildersKt$serverSentEvents$8) != coroutine_suspended) {
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                clientSSESessionWithDeserialization2 = clientSSESessionWithDeserialization;
                throw mapToSSEException(clientSSESessionWithDeserialization2.getCall().getResponse(), th);
            }
            if (i != 0) {
            }
            clientSSESessionWithDeserialization = (ClientSSESessionWithDeserialization) m7920serverSentEventsSessionmY9Nd3A;
        } catch (Throwable th3) {
            CoroutineScopeKt.cancel$default((CoroutineScope) buildersKt$serverSentEvents$8, null, 1, null);
            throw th3;
        }
        buildersKt$serverSentEvents$8 = new BuildersKt$serverSentEvents$8(continuation);
        Object obj2 = buildersKt$serverSentEvents$8.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$serverSentEvents$8.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_BqdlHlk$lambda$19(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-BqdlHlk, reason: not valid java name */
    public static final Object m7907serverSentEventsBqdlHlk(HttpClient httpClient, final String str, final String str2, final Integer num, final String str3, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        Object m7909serverSentEventsMswn_c = m7909serverSentEventsMswn_c(httpClient, new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEvents_BqdlHlk$lambda$20;
                serverSentEvents_BqdlHlk$lambda$20 = BuildersKt.serverSentEvents_BqdlHlk$lambda$20(str, str2, num, str3, function1, (HttpRequestBuilder) obj);
                return serverSentEvents_BqdlHlk$lambda$20;
            }
        }, function2, duration, bool, bool2, function22, continuation);
        return m7909serverSentEventsMswn_c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7909serverSentEventsMswn_c : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_BqdlHlk$lambda$20(String str, String str2, Integer num, String str3, Function1 function1, HttpRequestBuilder serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        HttpRequestKt.url$default(serverSentEvents, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEvents);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_pTj2aPc$lambda$21(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-pTj2aPc, reason: not valid java name */
    public static final Object m7913serverSentEventspTj2aPc(HttpClient httpClient, final String str, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        Object m7909serverSentEventsMswn_c = m7909serverSentEventsMswn_c(httpClient, new Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit serverSentEvents_pTj2aPc$lambda$22;
                serverSentEvents_pTj2aPc$lambda$22 = BuildersKt.serverSentEvents_pTj2aPc$lambda$22(str, function1, (HttpRequestBuilder) obj);
                return serverSentEvents_pTj2aPc$lambda$22;
            }
        }, function2, duration, bool, bool2, function22, continuation);
        return m7909serverSentEventsMswn_c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7909serverSentEventsMswn_c : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverSentEvents_pTj2aPc$lambda$22(String str, Function1 function1, HttpRequestBuilder serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        URLParserKt.takeFrom(serverSentEvents.getUrl(), str);
        function1.invoke(serverSentEvents);
        return Unit.INSTANCE;
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final Object m7944sseSessionmY9Nd3A(HttpClient httpClient, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESessionWithDeserialization> continuation) {
        return m7920serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sseSession_tL6_L_A$lambda$23(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sseSession-tL6_L-A, reason: not valid java name */
    public static final Object m7947sseSessiontL6_LA(HttpClient httpClient, String str, String str2, Integer num, String str3, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESessionWithDeserialization> continuation) {
        return m7923serverSentEventsSessiontL6_LA(httpClient, str, str2, num, str3, function2, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sseSession_Mswn__c$lambda$24(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sseSession-Mswn-_c, reason: not valid java name */
    public static final Object m7939sseSessionMswn_c(HttpClient httpClient, String str, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESessionWithDeserialization> continuation) {
        return m7915serverSentEventsSessionMswn_c(httpClient, str, function2, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final Object m7930sseMswn_c(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        Object m7909serverSentEventsMswn_c = m7909serverSentEventsMswn_c(httpClient, function1, function2, duration, bool, bool2, function22, continuation);
        return m7909serverSentEventsMswn_c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7909serverSentEventsMswn_c : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sse_BAHpl2s$lambda$25(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sse-BAHpl2s, reason: not valid java name */
    public static final Object m7927sseBAHpl2s(HttpClient httpClient, String str, String str2, Integer num, String str3, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        Object m7907serverSentEventsBqdlHlk = m7907serverSentEventsBqdlHlk(httpClient, str, str2, num, str3, function2, duration, bool, bool2, function1, function22, continuation);
        return m7907serverSentEventsBqdlHlk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7907serverSentEventsBqdlHlk : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sse_Q9yt8Vw$lambda$26(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: sse-Q9yt8Vw, reason: not valid java name */
    public static final Object m7933sseQ9yt8Vw(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function2<? super ClientSSESessionWithDeserialization, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super Unit> continuation) {
        Object m7913serverSentEventspTj2aPc = m7913serverSentEventspTj2aPc(httpClient, str, function2, duration, bool, bool2, function1, function22, continuation);
        return m7913serverSentEventspTj2aPc == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7913serverSentEventspTj2aPc : Unit.INSTANCE;
    }

    /* renamed from: processSession-rp2poPw, reason: not valid java name */
    private static final /* synthetic */ <T> Object m7902processSessionrp2poPw(HttpClient httpClient, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Function1<? super HttpRequestBuilder, Unit> function12, Continuation<? super T> continuation) {
        HttpClientPluginKt.plugin(httpClient, SSEKt.getSSE());
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, true);
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, duration);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        function12.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        Intrinsics.needClassReification();
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new BuildersKt$processSession$2(httpStatement, CompletableDeferred$default, null), 3, null);
        InlineMarker.mark(0);
        Object await = CompletableDeferred$default.await(continuation);
        InlineMarker.mark(1);
        return await;
    }

    private static final <T> void addAttribute(HttpRequestBuilder httpRequestBuilder, AttributeKey<T> attributeKey, T t) {
        if (t != null) {
            httpRequestBuilder.getAttributes().put(attributeKey, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable mapToSSEException(HttpResponse httpResponse, Throwable th) {
        return (!(th instanceof SSEClientException) || ((SSEClientException) th).getResponse() == null) ? new SSEClientException(httpResponse, th, th.getMessage()) : th;
    }

    /* renamed from: serverSentEventsSession-i8z2VEo, reason: not valid java name */
    public static final Object m7917serverSentEventsSessioni8z2VEo(HttpClient httpClient, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESession> continuation) {
        HttpClientPluginKt.plugin(httpClient, SSEKt.getSSE());
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, Boxing.boxBoolean(true));
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, duration);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new BuildersKt$serverSentEventsSessioni8z2VEo$$inlined$processSessionrp2poPw$1(new HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final Object m7920serverSentEventsSessionmY9Nd3A(HttpClient httpClient, Function2<? super TypeInfo, ? super String, ? extends Object> function2, Duration duration, Boolean bool, Boolean bool2, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super ClientSSESessionWithDeserialization> continuation) {
        HttpClientPluginKt.plugin(httpClient, SSEKt.getSSE());
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, Boxing.boxBoolean(true));
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, duration);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        addAttribute(httpRequestBuilder, deserializerAttr, function2);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(new HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    static {
        KType kType;
        KType kType2;
        KType kType3;
        KType kType4;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
        KType kType5 = null;
        try {
            kType = Reflection.typeOf(Boolean.TYPE);
        } catch (Throwable unused) {
            kType = null;
        }
        sseRequestAttr = new AttributeKey<>("SSERequestFlag", new TypeInfo(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Duration.class);
        try {
            kType2 = Reflection.typeOf(Duration.class);
        } catch (Throwable unused2) {
            kType2 = null;
        }
        reconnectionTimeAttr = new AttributeKey<>("SSEReconnectionTime", new TypeInfo(orCreateKotlinClass2, kType2));
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Boolean.class);
        try {
            kType3 = Reflection.typeOf(Boolean.TYPE);
        } catch (Throwable unused3) {
            kType3 = null;
        }
        showCommentEventsAttr = new AttributeKey<>("SSEShowCommentEvents", new TypeInfo(orCreateKotlinClass3, kType3));
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Boolean.class);
        try {
            kType4 = Reflection.typeOf(Boolean.TYPE);
        } catch (Throwable unused4) {
            kType4 = null;
        }
        showRetryEventsAttr = new AttributeKey<>("SSEShowRetryEvents", new TypeInfo(orCreateKotlinClass4, kType4));
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Function2.class);
        try {
            kType5 = Reflection.typeOf(Function2.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(TypeInfo.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
        } catch (Throwable unused5) {
        }
        deserializerAttr = new AttributeKey<>("SSEDeserializer", new TypeInfo(orCreateKotlinClass5, kType5));
    }
}
