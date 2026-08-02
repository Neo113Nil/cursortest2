package androidx.activity;

import M4.c;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ActivityC5043j;
import androidx.core.view.C5344u;
import androidx.core.view.InterfaceC5348w;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.FragmentC5414e0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import f.C6388a;
import f.InterfaceC6389b;
import f3.AbstractC6409a;
import f3.C6412d;
import g.AbstractC6592d;
import g.AbstractC6595g;
import g.C6600l;
import g.InterfaceC6590b;
import g.InterfaceC6591c;
import g.InterfaceC6599k;
import h.AbstractC6755a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x2.InterfaceC10646a;

@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u0002:\nÝ\u0001Þ\u0001ß\u0001à\u0001á\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\u001f\u0010\"J#\u0010\u001f\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b\u001f\u0010%J#\u0010&\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0016H\u0017¢\u0006\u0004\b'\u0010\u0010J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b/\u0010.J)\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u0002032\u0006\u00100\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u0002032\u0006\u00100\u001a\u00020\u00112\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010B\u001a\u00020\u0003H\u0016¢\u0006\u0004\b@\u0010CJ'\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010E\u001a\u00020DH\u0017¢\u0006\u0004\b@\u0010FJ\u0017\u0010G\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bG\u0010AJ\u000f\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010\u0010J\u000f\u0010I\u001a\u00020\u0016H\u0017¢\u0006\u0004\bI\u0010\u0010J\u001f\u0010M\u001a\u00020\u00162\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0011H\u0017¢\u0006\u0004\bM\u0010NJ)\u0010M\u001a\u00020\u00162\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00112\b\u0010O\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bM\u0010PJA\u0010V\u001a\u00020\u00162\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u0011H\u0017¢\u0006\u0004\bV\u0010WJK\u0010V\u001a\u00020\u00162\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u00112\b\u0010O\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bV\u0010XJ)\u0010[\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010JH\u0015¢\u0006\u0004\b[\u0010\\J-\u0010b\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00112\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010a\u001a\u00020`H\u0017¢\u0006\u0004\bb\u0010cJI\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\u0006\u0010i\u001a\u00020h2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010nJA\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010oJ\u0017\u0010r\u001a\u00020\u00162\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0004\br\u0010sJ\u001b\u0010u\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020p0t¢\u0006\u0004\bu\u0010vJ\u001b\u0010w\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020p0t¢\u0006\u0004\bw\u0010vJ\u0017\u0010y\u001a\u00020\u00162\u0006\u0010x\u001a\u00020\u0011H\u0017¢\u0006\u0004\by\u0010\u0013J\u001b\u0010z\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110t¢\u0006\u0004\bz\u0010vJ\u001b\u0010{\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110t¢\u0006\u0004\b{\u0010vJ\u0017\u0010|\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0015¢\u0006\u0004\b|\u0010}J\u001b\u0010~\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020J0t¢\u0006\u0004\b~\u0010vJ\u001b\u0010\u007f\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020J0t¢\u0006\u0004\b\u007f\u0010vJ\u001b\u0010\u0081\u0001\u001a\u00020\u00162\u0007\u0010\u0080\u0001\u001a\u000203H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0081\u0001\u001a\u00020\u00162\u0007\u0010\u0080\u0001\u001a\u0002032\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\u001e\u0010\u0085\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010t¢\u0006\u0005\b\u0085\u0001\u0010vJ\u001e\u0010\u0086\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010t¢\u0006\u0005\b\u0086\u0001\u0010vJ\u001b\u0010\u0088\u0001\u001a\u00020\u00162\u0007\u0010\u0087\u0001\u001a\u000203H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0082\u0001J#\u0010\u0088\u0001\u001a\u00020\u00162\u0007\u0010\u0087\u0001\u001a\u0002032\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010t¢\u0006\u0005\b\u008a\u0001\u0010vJ\u001e\u0010\u008b\u0001\u001a\u00020\u00162\r\u0010,\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010t¢\u0006\u0005\b\u008b\u0001\u0010vJ\u0011\u0010\u008c\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u008c\u0001\u0010\u0010J\u0019\u0010\u008e\u0001\u001a\u00020\u00162\u0007\u0010,\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u00020\u00162\u0007\u0010,\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J\u0011\u0010\u0091\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0091\u0001\u0010\u0010J\u0011\u0010\u0092\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0010J\u001c\u0010\u0095\u0001\u001a\u00020\u00162\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0003¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0013\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001f\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u0012\u0005\b£\u0001\u0010\u0010R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010§\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030©\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010dR\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010²\u0001\u001a\u00020h8\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¸\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010t0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¸\u0001R\u0019\u0010¾\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010«\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R(\u0010Ê\u0001\u001a\u00030\u0093\u00018FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÆ\u0001\u0010«\u0001\u0012\u0005\bÉ\u0001\u0010\u0010\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u001cR\u0018\u0010Ð\u0001\u001a\u00030Í\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ó\u0001\u001a\u00030¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010Û\u0001\u001a\u00030Ø\u00018F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006â\u0001"}, d2 = {"Landroidx/activity/j;", "Landroidx/core/app/g;", "", "Landroidx/lifecycle/J;", "Landroidx/lifecycle/B0;", "Landroidx/lifecycle/s;", "LM4/e;", "Landroidx/activity/M;", "Lg/k;", "Lg/c;", "Landroidx/core/content/c;", "Landroidx/core/content/d;", "Landroidx/core/app/o;", "Landroidx/core/app/p;", "Landroidx/core/view/r;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lf/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(Lf/b;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/w;", "provider", "addMenuProvider", "(Landroidx/core/view/w;)V", "owner", "(Landroidx/core/view/w;Landroidx/lifecycle/J;)V", "Landroidx/lifecycle/v$b;", "state", "(Landroidx/core/view/w;Landroidx/lifecycle/J;Landroidx/lifecycle/v$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lh/a;", "contract", "Lg/g;", "registry", "Lg/b;", "callback", "Lg/d;", "registerForActivityResult", "(Lh/a;Lg/g;Lg/b;)Lg/d;", "(Lh/a;Lg/b;)Lg/d;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lx2/a;", "addOnConfigurationChangedListener", "(Lx2/a;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/i;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/r;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Landroidx/activity/J;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/J;)V", "Landroidx/activity/j$e;", "createFullyDrawnExecutor", "()Landroidx/activity/j$e;", "Lf/a;", "contextAwareHelper", "Lf/a;", "Landroidx/core/view/u;", "menuHostHelper", "Landroidx/core/view/u;", "LM4/d;", "savedStateRegistryController", "LM4/d;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/A0;", "_viewModelStore", "Landroidx/lifecycle/A0;", "reportFullyDrawnExecutor", "Landroidx/activity/j$e;", "Landroidx/activity/B;", "fullyDrawnReporter$delegate", "LSc/j;", "getFullyDrawnReporter", "()Landroidx/activity/B;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lg/g;", "getActivityResultRegistry", "()Lg/g;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/z0$b;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/z0$b;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/J;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/A0;", "viewModelStore", "Lf3/a;", "getDefaultViewModelCreationExtras", "()Lf3/a;", "defaultViewModelCreationExtras", "LM4/c;", "getSavedStateRegistry", "()LM4/c;", "savedStateRegistry", "Companion", "b", "c", "d", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC5043j extends androidx.core.app.g implements B0, InterfaceC5431s, M4.e, M, InterfaceC6599k, InterfaceC6591c, androidx.core.content.c, androidx.core.content.d, androidx.core.app.o, androidx.core.app.p, androidx.core.view.r {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final c Companion = new c();
    private A0 _viewModelStore;

    @NotNull
    private final AbstractC6595g activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final C6388a contextAwareHelper;

    /* renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fullyDrawnReporter;

    @NotNull
    private final C5344u menuHostHelper;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    /* renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBackPressedDispatcher;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC10646a<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC10646a<androidx.core.app.i>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC10646a<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC10646a<androidx.core.app.r>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC10646a<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final e reportFullyDrawnExecutor;

    @NotNull
    private final M4.d savedStateRegistryController;

    /* renamed from: androidx.activity.j$a */
    public static final class a implements androidx.lifecycle.G {
        a() {
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NotNull androidx.lifecycle.J source, @NotNull AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            ActivityC5043j activityC5043j = ActivityC5043j.this;
            activityC5043j.ensureViewModelStore();
            activityC5043j.getLifecycle().e(this);
        }
    }

    /* renamed from: androidx.activity.j$b */
    /* loaded from: classes8.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f36962a = new b();

        @NotNull
        public final OnBackInvokedDispatcher a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* renamed from: androidx.activity.j$c */
    private static final class c {
    }

    /* renamed from: androidx.activity.j$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private Object f36963a;

        /* renamed from: b, reason: collision with root package name */
        private A0 f36964b;

        public final Object a() {
            return this.f36963a;
        }

        public final A0 b() {
            return this.f36964b;
        }

        public final void c(Object obj) {
            this.f36963a = obj;
        }

        public final void d(A0 a02) {
            this.f36964b = a02;
        }
    }

    /* renamed from: androidx.activity.j$e */
    private interface e extends Executor {
        void I(@NotNull View view);

        void W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.j$f */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f36965a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: b, reason: collision with root package name */
        private Runnable f36966b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36967c;

        public f() {
        }

        public static void a(f this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Runnable runnable = this$0.f36966b;
            if (runnable != null) {
                runnable.run();
                this$0.f36966b = null;
            }
        }

        @Override // androidx.activity.ActivityC5043j.e
        public final void I(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.f36967c) {
                return;
            }
            this.f36967c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.ActivityC5043j.e
        public final void W() {
            ActivityC5043j activityC5043j = ActivityC5043j.this;
            activityC5043j.getWindow().getDecorView().removeCallbacks(this);
            activityC5043j.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f36966b = runnable;
            View decorView = ActivityC5043j.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.f36967c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC5043j.f.a(ActivityC5043j.f.this);
                    }
                });
            } else if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Runnable runnable = this.f36966b;
            ActivityC5043j activityC5043j = ActivityC5043j.this;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f36965a) {
                    this.f36967c = false;
                    activityC5043j.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f36966b = null;
            if (activityC5043j.getFullyDrawnReporter().b()) {
                this.f36967c = false;
                activityC5043j.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityC5043j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: androidx.activity.j$g */
    public static final class g extends AbstractC6595g {
        g() {
        }

        @Override // g.AbstractC6595g
        public final void f(final int i11, @NotNull AbstractC6755a contract, Object obj) {
            Bundle bundle;
            final int i12;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ActivityC5043j activityC5043j = ActivityC5043j.this;
            final AbstractC6755a.C1046a b11 = contract.b(activityC5043j, obj);
            if (b11 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC5043j.g this$0 = ActivityC5043j.g.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.d(i11, b11.a());
                    }
                });
                return;
            }
            Intent a11 = contract.a(activityC5043j, obj);
            if (a11.getExtras() != null) {
                Bundle extras = a11.getExtras();
                Intrinsics.f(extras);
                if (extras.getClassLoader() == null) {
                    a11.setExtrasClassLoader(activityC5043j.getClassLoader());
                }
            }
            if (a11.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a11.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a11.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a11.getAction())) {
                String[] stringArrayExtra = a11.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.e(activityC5043j, stringArrayExtra, i11);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a11.getAction())) {
                androidx.core.app.b.i(activityC5043j, a11, i11, bundle2);
                return;
            }
            C6600l c6600l = (C6600l) a11.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.f(c6600l);
                i12 = i11;
                try {
                    androidx.core.app.b.j(activityC5043j, c6600l.d(), i12, c6600l.a(), c6600l.b(), c6600l.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e11) {
                    e = e11;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC5043j.g this$0 = ActivityC5043j.g.this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            IntentSender.SendIntentException e12 = sendIntentException;
                            Intrinsics.checkNotNullParameter(e12, "$e");
                            this$0.e(i12, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e12));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e12) {
                e = e12;
                i12 = i11;
            }
        }
    }

    /* renamed from: androidx.activity.j$h */
    static final class h extends AbstractC7737t implements Function0<n0> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final n0 invoke() {
            ActivityC5043j activityC5043j = ActivityC5043j.this;
            return new n0(activityC5043j.getApplication(), activityC5043j, activityC5043j.getIntent() != null ? activityC5043j.getIntent().getExtras() : null);
        }
    }

    /* renamed from: androidx.activity.j$i */
    static final class i extends AbstractC7737t implements Function0<B> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B invoke() {
            ActivityC5043j activityC5043j = ActivityC5043j.this;
            return new B(activityC5043j.reportFullyDrawnExecutor, new C5047n(activityC5043j));
        }
    }

    /* renamed from: androidx.activity.j$j, reason: collision with other inner class name */
    static final class C0711j extends AbstractC7737t implements Function0<J> {
        C0711j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            final ActivityC5043j activityC5043j = ActivityC5043j.this;
            final J j11 = new J(new RunnableC5048o(activityC5043j, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC5043j this$0 = ActivityC5043j.this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            J dispatcher = j11;
                            Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                            this$0.addObserverForBackInvoker(dispatcher);
                        }
                    });
                    return j11;
                }
                activityC5043j.addObserverForBackInvoker(j11);
            }
            return j11;
        }
    }

    public ActivityC5043j() {
        this.contextAwareHelper = new C6388a();
        this.menuHostHelper = new C5344u(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC5043j.menuHostHelper$lambda$0(ActivityC5043j.this);
            }
        });
        Intrinsics.checkNotNullParameter(this, "owner");
        M4.d dVar = new M4.d(this);
        this.savedStateRegistryController = dVar;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = Sc.k.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.G() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.G
            public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
                ActivityC5043j._init_$lambda$2(ActivityC5043j.this, j11, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.G() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.G
            public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
                ActivityC5043j._init_$lambda$3(ActivityC5043j.this, j11, aVar);
            }
        });
        getLifecycle().a(new a());
        dVar.b();
        j0.b(this);
        getSavedStateRegistry().g(ACTIVITY_RESULT_TAG, new c.b() { // from class: androidx.activity.g
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle _init_$lambda$4;
                _init_$lambda$4 = ActivityC5043j._init_$lambda$4(ActivityC5043j.this);
                return _init_$lambda$4;
            }
        });
        addOnContextAvailableListener(new InterfaceC6389b() { // from class: androidx.activity.h
            @Override // f.InterfaceC6389b
            public final void a(ActivityC5043j activityC5043j) {
                ActivityC5043j._init_$lambda$5(ActivityC5043j.this, activityC5043j);
            }
        });
        this.defaultViewModelProviderFactory = Sc.k.b(new h());
        this.onBackPressedDispatcher = Sc.k.b(new C0711j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ActivityC5043j this$0, androidx.lifecycle.J j11, AbstractC5434v.a event) {
        Window window;
        View peekDecorView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC5434v.a.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ActivityC5043j this$0, androidx.lifecycle.J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_DESTROY) {
            this$0.contextAwareHelper.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            this$0.reportFullyDrawnExecutor.W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ActivityC5043j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ActivityC5043j this$0, Context it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle b11 = this$0.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b11 != null) {
            this$0.activityResultRegistry.g(b11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final J dispatcher) {
        getLifecycle().a(new androidx.lifecycle.G(this) { // from class: androidx.activity.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityC5043j f36960b;

            {
                this.f36960b = this;
            }

            @Override // androidx.lifecycle.G
            public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
                ActivityC5043j.addObserverForBackInvoker$lambda$7(dispatcher, this.f36960b, j11, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(J dispatcher, ActivityC5043j this$0, androidx.lifecycle.J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_CREATE) {
            dispatcher.m(b.f36962a.a(this$0));
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new A0();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ActivityC5043j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.addContentView(view, params);
    }

    @Override // androidx.core.view.r
    public void addMenuProvider(@NotNull InterfaceC5348w provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    @Override // androidx.core.content.c
    public final void addOnConfigurationChangedListener(@NotNull InterfaceC10646a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull InterfaceC6389b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.o
    public final void addOnMultiWindowModeChangedListener(@NotNull InterfaceC10646a<androidx.core.app.i> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull InterfaceC10646a<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.p
    public final void addOnPictureInPictureModeChangedListener(@NotNull InterfaceC10646a<androidx.core.app.r> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.d
    public final void addOnTrimMemoryListener(@NotNull InterfaceC10646a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // g.InterfaceC6599k
    @NotNull
    public final AbstractC6595g getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NotNull
    public AbstractC6409a getDefaultViewModelCreationExtras() {
        C6412d c6412d = new C6412d(0);
        if (getApplication() != null) {
            z0.a.C0800a c0800a = z0.a.f43418c;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            c6412d.c(c0800a, application);
        }
        c6412d.c(j0.f43329a, this);
        c6412d.c(j0.f43330b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c6412d.c(j0.f43331c, extras);
        }
        return c6412d;
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NotNull
    public z0.b getDefaultViewModelProviderFactory() {
        return (z0.b) this.defaultViewModelProviderFactory.getValue();
    }

    @NotNull
    public B getFullyDrawnReporter() {
        return (B) this.fullyDrawnReporter.getValue();
    }

    @InterfaceC3999a
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.g, androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.M
    @NotNull
    public final J getOnBackPressedDispatcher() {
        return (J) this.onBackPressedDispatcher.getValue();
    }

    @Override // M4.e
    @NotNull
    public final M4.c getSavedStateRegistry() {
        return this.savedStateRegistryController.a();
    }

    @Override // androidx.lifecycle.B0
    @NotNull
    public A0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        A0 a02 = this._viewModelStore;
        Intrinsics.f(a02);
        return a02;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        C0.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        D0.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        M4.f.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Q.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        P.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.e(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC10646a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.c(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        int i11 = FragmentC5414e0.f43309b;
        FragmentC5414e0.a.b(this);
        int i12 = this.contentLayoutId;
        if (i12 != 0) {
            setContentView(i12);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.e(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.g(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC10646a<androidx.core.app.i>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.i(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC10646a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.f(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC10646a<androidx.core.app.r>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.r(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.h(menu);
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.e(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @InterfaceC3999a
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        A0 a02 = this._viewModelStore;
        if (a02 == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            a02 = dVar.b();
        }
        if (a02 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(onRetainCustomNonConfigurationInstance);
        dVar2.d(a02);
        return dVar2;
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.L) {
            AbstractC5434v lifecycle = getLifecycle();
            Intrinsics.g(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.L) lifecycle).j(AbstractC5434v.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.d(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC10646a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    @NotNull
    public final <I, O> AbstractC6592d<I> registerForActivityResult(@NotNull AbstractC6755a<I, O> contract, @NotNull AbstractC6595g registry, @NotNull InterfaceC6590b<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.i("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.r
    public void removeMenuProvider(@NotNull InterfaceC5348w provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.i(provider);
    }

    @Override // androidx.core.content.c
    public final void removeOnConfigurationChangedListener(@NotNull InterfaceC10646a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(@NotNull InterfaceC6389b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.o
    public final void removeOnMultiWindowModeChangedListener(@NotNull InterfaceC10646a<androidx.core.app.i> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(@NotNull InterfaceC10646a<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.p
    public final void removeOnPictureInPictureModeChangedListener(@NotNull InterfaceC10646a<androidx.core.app.r> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.d
    public final void removeOnTrimMemoryListener(@NotNull InterfaceC10646a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        U4.a.b();
        super.reportFullyDrawn();
        getFullyDrawnReporter().a();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void addMenuProvider(@NotNull InterfaceC5348w provider, @NotNull androidx.lifecycle.J owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.c(provider, owner);
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void startActivityForResult(@NotNull Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull InterfaceC5348w provider, @NotNull androidx.lifecycle.J owner, @NotNull AbstractC5434v.b state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.d(provider, owner, state);
    }

    @Override // g.InterfaceC6591c
    @NotNull
    public final <I, O> AbstractC6592d<I> registerForActivityResult(@NotNull AbstractC6755a<I, O> contract, @NotNull InterfaceC6590b<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC10646a<androidx.core.app.i>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.i(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC10646a<androidx.core.app.r>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.r(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(view, params);
    }

    public ActivityC5043j(int i11) {
        this();
        this.contentLayoutId = i11;
    }
}
